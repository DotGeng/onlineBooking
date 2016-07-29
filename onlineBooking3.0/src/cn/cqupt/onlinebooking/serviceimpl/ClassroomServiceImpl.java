package cn.cqupt.onlinebooking.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;

import cn.cqupt.onlinebooking.mapper.ClassroomMapperCustom;
import cn.cqupt.onlinebooking.mapper.ClassroombookingMapperCustom;
import cn.cqupt.onlinebooking.mapper.PeriodMapperCustome;
import cn.cqupt.onlinebooking.mapper.ProctorMapperCustome;
import cn.cqupt.onlinebooking.mapper.SeatMapperCustome;
import cn.cqupt.onlinebooking.mapper.StudentbookingMapperCustome;
import cn.cqupt.onlinebooking.po.Classroom;
import cn.cqupt.onlinebooking.po.ClassroomCustom;
import cn.cqupt.onlinebooking.po.ClassroomQueryVO;
import cn.cqupt.onlinebooking.po.ClassroombookingCount;
import cn.cqupt.onlinebooking.po.ClassroombookingCustom;
import cn.cqupt.onlinebooking.po.ProctorCustome;
import cn.cqupt.onlinebooking.po.SeatCustome;
import cn.cqupt.onlinebooking.po.Student;
import cn.cqupt.onlinebooking.po.StudentbookingCounted;
import cn.cqupt.onlinebooking.service.ClassroomService;

public class ClassroomServiceImpl implements ClassroomService {
	@Autowired
	private ClassroomMapperCustom classroomMapperCustom;
	@Autowired
	private SeatMapperCustome seatMapperCustome;
	@Autowired
	private StudentbookingMapperCustome studentbookingMapperCustome;
	@Autowired
	private ProctorMapperCustome proctorMapperCustome;
	@Autowired
	private ClassroombookingMapperCustom classroombookingMapperCustom;
	@Autowired
	private PeriodMapperCustome periodMapperCustome;
	public List<ClassroomCustom> getAllClassroom(
			ClassroomQueryVO classroomQueryVO) {
		return classroomMapperCustom.getAllClassroom(classroomQueryVO);
	}
	public void addClassroom(ClassroomCustom classroomCustom) {
		classroomMapperCustom.addClassroom(classroomCustom);
	}
	public List<SeatCustome> findSeatByClassRoom(String classRoom)
			throws Exception {
		return seatMapperCustome.findSeatByClassRoom(classRoom);
	}
	public void deleteSeatByClassroomName(String classroomName)
			throws Exception {
		classroomMapperCustom.deleteSeatByClassroomName(classroomName);
	}
	public void updateClassroomByID(ClassroomCustom classroomCustom) throws Exception {
		classroomMapperCustom.updateClassroomByID(classroomCustom);
	}
	public void deleteClassroomById(Integer classroomId) throws Exception {
		classroomMapperCustom.deleteClassroomById(classroomId);
	}
	public void modifySeatAndSubmit(List<SeatCustome> seatsList)
			throws Exception {
		synchronized (this) {
			//现在seat表中删除所有的该房间座位的信息
			classroomMapperCustom.deleteSeatByClassroomName(seatsList.get(0).getClassroomname());
			//向seat表中插入所有的信息
			for (SeatCustome seatCustome : seatsList) {
				seatMapperCustome.insertSeatByClassroomId(seatCustome);
			}
		}
		
	}
	public List<ProctorCustome> getProctorList() throws Exception {
		List<ProctorCustome> proctorList = proctorMapperCustome.getProctorList();
		
		return proctorList;
	}
	public List<ClassroomCustom> getAllClassroomNameAndId() throws Exception {
		return classroomMapperCustom.getAllClassroomNameAndId();
	}
	public void insertProctorAndExamToDB(ProctorCustome proctorCustome)
			throws Exception {
		proctorMapperCustome.insertProctorAndExamToDB(proctorCustome);
	}
	public ProctorCustome getProctorByExamId(Integer examID) throws Exception {
		return proctorMapperCustome.getProctorByExamId(examID);
	}
	public void updateProctorByExamId(Integer examId,
			ProctorCustome proctorCustome) throws Exception {
		proctorCustome.setExamid(examId);
		proctorMapperCustome.updateProctorByExamId(proctorCustome);
	}
	public void deleteProctorByExamID(Integer examID) throws Exception {
		proctorMapperCustome.deleteProctorByExamID(examID);
	}
	public List<ProctorCustome> getExamInformationNotRepeat() throws Exception {
		List<ProctorCustome> proctorList = proctorMapperCustome.getProctorList();
		//机房的最大容量
		List<ClassroombookingCount> classroombookingCountList = classroombookingMapperCustom.getClassroombookingCounts();
		List<StudentbookingCounted> studentbookingCountedList = classroombookingMapperCustom.getStudentbookingCounted();
		Map<Integer, Integer> classroomBookingMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> studentbookingCountedMap = new HashMap<Integer, Integer>();
		for(ClassroombookingCount classroombookingCount:classroombookingCountList) {
			classroomBookingMap.put(classroombookingCount.getClassroomID(), classroombookingCount.getMaxSize());
		}
		for(StudentbookingCounted studentbookingCounted : studentbookingCountedList) {
			studentbookingCountedMap.put(studentbookingCounted.getExamID(), studentbookingCounted.getCountNum());
		}
		for(ProctorCustome proctor :proctorList) {
			proctor.setClassroomBookingSize(classroomBookingMap.get(proctor.getExamroomid()));
			proctor.setStudentBookingCount(studentbookingCountedMap.get(proctor.getExamid()));
		}
		return proctorList;
	}
	public List<SeatCustome> getSeatsNotUsed(Integer classroomId)
			throws Exception {
		return studentbookingMapperCustome.getSeatsNotUsed(classroomId);
	}
	public List<String> getClassroomWithState(
			Integer examroomid, Integer batch) throws Exception {
		List<String> resultList = new ArrayList<String>();
		 List<ClassroombookingCustom> classroombookingCustomList = classroombookingMapperCustom.getClassroomWithState(examroomid, batch);
		Map<String, String> map = new HashMap<String, String>();
		//int i = 0;
		for (ClassroombookingCustom classroombookingCustom : classroombookingCustomList) {
			//String batchTmpe = classroombookingCustom.getBatch().toString();
			String week = classroombookingCustom.getWeek().toString();
			String period = classroombookingCustom.getPeriodid().toString();
			String key = week +","+ period;
			if(classroombookingCustom.getState() == 1) {//1代表有考试
				map.put(key, classroombookingCustom.getTeacherName());
			}else if(classroombookingCustom.getState() == 2) {//2 代表有课
				map.put(key,"2");
			}
			
			
		}
		//把map加工成list
		int periodCount = periodMapperCustome.getCountPeriod();
		for(int i = 1 ; i <= periodCount; i ++) {
			for(int j = 1; j <= 7 ; j++) {
				String week = String.valueOf(j);
				String period = String.valueOf(i);
				String resultKey = week+ ","+ period;
				if(map.get(resultKey) == null) {
					resultList.add("0");//代表没课
				}else if(map.get(resultKey).equals("2")) {
					resultList.add("2");//代表有课
				}else {
					resultList.add(map.get(resultKey));//代表有考试，并且记录监考老师名字
				}
			}
		}
		return resultList;
	}
	public String getClassroomNameByClassroomId(int classroomId)
			throws Exception {
		return classroomMapperCustom.getClassroomNameByClassroomId(classroomId);
	}
	public void updateClassroomState(Integer classroomId,Integer teacherid, Integer batch,
			Integer week, Integer period, Integer state, Integer wantToState)
			throws Exception {
		//修改机房从无课到有课状态
		if(state == 0 && wantToState == 2) {
			classroombookingMapperCustom.updateClassroomStateFromNOClassToClass(classroomId, batch, week, period, wantToState);
		}else if(state == 2 && wantToState == 0){//从有课到无课状态
			classroombookingMapperCustom.updateClassroomStateFromClassToNoClass(classroomId, batch, week, period, wantToState);
		}else if(state == 1 && wantToState == 1) {//修改机房有考试时候的监考老师
			classroombookingMapperCustom.updateClassroomProctorID(classroomId, teacherid, batch, week, period, wantToState);
		}else if(state == 1 && wantToState != 1) {//把有考试的时候修改为没有考试
			classroombookingMapperCustom.updateTestToNoClass1(classroomId, batch, week, period, wantToState);
			classroombookingMapperCustom.updateTestToNoClass2(classroomId, batch, week, period, wantToState);
		}else if(state !=1  && wantToState == 1) {//把没有考试的时候设置为有考试
			classroombookingMapperCustom.updateNoTestToTest1(classroomId,teacherid, batch, week, period, wantToState);
			classroombookingMapperCustom.updateNoTestToTest2(classroomId,teacherid, batch, week, period, wantToState);
			classroombookingMapperCustom.updateNoTestToTest3(classroomId,teacherid, batch, week, period, wantToState);
		}
	}
	public List<StudentbookingCounted> getStudentbookingCounted()
			throws Exception {
		
		return null;
	}
	public List<ClassroombookingCount> getClassroombookingCounts()
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
