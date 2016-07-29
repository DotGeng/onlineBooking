package cn.cqupt.onlinebooking.serviceimpl;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.mysql.jdbc.ResultSetMetaData;

import cn.cqupt.onlinebooking.mapper.StudentMapperCustom;
import cn.cqupt.onlinebooking.mapper.TeacherMapperCustom;
import cn.cqupt.onlinebooking.po.ScoreCustome;
import cn.cqupt.onlinebooking.po.StudentCustom;
import cn.cqupt.onlinebooking.po.TeacherCustom;
import cn.cqupt.onlinebooking.service.UploadOrDowLoadService;
public class UploadOrDownloadServiceImpl implements UploadOrDowLoadService{
	
	@Autowired
	private TeacherMapperCustom teacherMapperCustom;
	@Autowired
	private StudentMapperCustom studentMapperCustom;
	public void uploadTeacher(MultipartFile Mfile) throws Exception {
		 //把spring文件上传的MultipartFile转换成File
        CommonsMultipartFile cf= (CommonsMultipartFile)Mfile; 
        DiskFileItem fi = (DiskFileItem)cf.getFileItem();
        File file = fi.getStoreLocation();
        
		Workbook wb = Workbook.getWorkbook(file);//从文件流中取得Excel工作区对象
		 Sheet sheet = wb.getSheet(0);//从工作区中取得页，取得这个对象的时候既可以用名称来获得，也可以用序号
		 String outPut = new String();
		 boolean flag = true;
		 for(int i=1; i < sheet.getRows() && flag; i++){
			 TeacherCustom teacherCustom = new TeacherCustom();
	            for(int j=0; j < sheet.getColumns(); j++){
	            	if(sheet.getCell(j,i).getContents() == null || sheet.getCell(j,i).getContents().toString().trim().equals("")) {
	            		flag = false;
	            		break;
	            	}
	            	
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("姓名") ) {
	            		teacherCustom.setTeachername(sheet.getCell(j,i).getContents().toString().trim());
	            	}
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("密码")) {
	            		teacherCustom.setTeacherpw(sheet.getCell(j,i).getContents().toString().trim());
	            	}
	            }
	            teacherCustom.setTeacherrole(1);
	            teacherMapperCustom.addTeacher(teacherCustom);
            	if(teacherCustom.getTeacherid() == null) {
            		System.out.println("第"+ i + "行数据添加失败，请检查数据格式是否正确");
            	}
	            //outPut = outPut + "<br>";
	        }
		 System.out.println(outPut);
	}
	public void uploadStudents(MultipartFile Mfile) throws Exception {
		 //把spring文件上传的MultipartFile转换成File
        CommonsMultipartFile cf= (CommonsMultipartFile)Mfile; 
        DiskFileItem fi = (DiskFileItem)cf.getFileItem();
        File file = fi.getStoreLocation();
        
		Workbook wb = Workbook.getWorkbook(file);//从文件流中取得Excel工作区对象
		 Sheet sheet = wb.getSheet(0);//从工作区中取得页，取得这个对象的时候既可以用名称来获得，也可以用序号
		 String outPut = new String();
		 boolean flag = true;
		 for(int i=1; i < sheet.getRows() && flag; i++){
			 //TeacherCustom teacherCustom = new TeacherCustom();
			 StudentCustom studentCustom = new StudentCustom();
	            for(int j=0; j < sheet.getColumns(); j++){
	            	if(sheet.getCell(j,i).getContents() == null || sheet.getCell(j,i).getContents().toString().trim().equals("")) {
	            		flag = false;
	            		break;
	            	}
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("学号")) {
	            		studentCustom.setStudentno(sheet.getCell(j,i).getContents().toString().trim());
	            	}
	            	
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("姓名") ) {
	            		//teacherCustom.setTeachername(sheet.getCell(j,i).getContents().toString().trim());
	            		studentCustom.setStudentname(sheet.getCell(j,i).getContents().toString().trim());
	            	}
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("密码")) {
	            		//teacherCustom.setTeacherpw(sheet.getCell(j,i).getContents().toString().trim());
	            		studentCustom.setStudentpw(sheet.getCell(j,i).getContents().toString().trim());
	            	}
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("专业")) {
	            		studentCustom.setMajor(sheet.getCell(j,i).getContents().toString().trim());
	            	}
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("学院")) {
	            		studentCustom.setColledge(sheet.getCell(j,i).getContents().toString().trim());
	            	}
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("是否通过")) {
	            		studentCustom.setPassed(Integer.parseInt(sheet.getCell(j,i).getContents().toString().trim()));
	            	}
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("分数")) {
	            		studentCustom.setScore(Integer.parseInt(sheet.getCell(j,i).getContents().toString().trim()));
	            	}
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("考试次数")) {
	            		studentCustom.setExamtimes(Integer.parseInt(sheet.getCell(j,i).getContents().toString().trim()));
	            	}
	            	
	            }
	            //teacherCustom.setTeacherrole(1);
	            studentMapperCustom.addStudent(studentCustom);
            	if(studentCustom.getStudentid() == null) {
            		System.out.println("第"+ i + "行数据添加失败，请检查数据格式是否正确");
            	}
	            //outPut = outPut + "<br>";
	        }
		 
		 System.out.println(outPut);
	}
	public List<ScoreCustome> getScoreByYearTermAndWeek(String year,
			Integer upOrDownYear, Integer week) throws Exception {
		
		return null;
	}
	//生成具体的excel表格
	public HSSFWorkbook resultSetToExcel(ResultSet rs, String sheetName) throws Exception {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("学生成绩表");
		HSSFRow row = sheet.createRow((short)0);
		HSSFCell cell = null;
		ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
		int nColumn = md.getColumnCount();
		System.out.println("nColumn"+nColumn);
		//写入各个字段的名称
		for(int i = 1; i <= nColumn; i++) {
			cell = row.createCell(i-1);
			cell.setCellType(HSSFCell.CELL_TYPE_STRING);
			cell.setCellValue(md.getColumnLabel(i));
		}
		int iRow = 1;
		//写入各条记录，每条记录对应excel的一行
		/*while() {
			
		}*/
		return null;
	}
	//更新学生成绩
	public int batchUpdateStudentScore(MultipartFile Mfile)
			throws Exception {
		// TODO Auto-generated method stub
		//把spring文件上传的MultipartFile转换成File
        CommonsMultipartFile cf= (CommonsMultipartFile)Mfile; 
        DiskFileItem fi = (DiskFileItem)cf.getFileItem();
        File file = fi.getStoreLocation();
        
		Workbook wb = Workbook.getWorkbook(file);//从文件流中取得Excel工作区对象
		 Sheet sheet = wb.getSheet(0);//从工作区中取得页，取得这个对象的时候既可以用名称来获得，也可以用序号
		 String outPut = new String();
		 boolean flag = true;
		 for(int i=1; i < sheet.getRows() && flag; i++){
			 //TeacherCustom teacherCustom = new TeacherCustom();
			 StudentCustom studentCustom = new StudentCustom();
	            for(int j=0; j < sheet.getColumns(); j++){
	            	if(sheet.getCell(j,i).getContents() == null || sheet.getCell(j,i).getContents().toString().trim().equals("")) {
	            		flag = false;
	            		break;
	            	}
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("学号")) {
	            		studentCustom.setStudentno(sheet.getCell(j,i).getContents().toString().trim());
	            	}
	            	
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("姓名") ) {
	            		//teacherCustom.setTeachername(sheet.getCell(j,i).getContents().toString().trim());
	            		studentCustom.setStudentname(sheet.getCell(j,i).getContents().toString().trim());
	            	}
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("密码")) {
	            		//teacherCustom.setTeacherpw(sheet.getCell(j,i).getContents().toString().trim());
	            		studentCustom.setStudentpw(sheet.getCell(j,i).getContents().toString().trim());
	            	}
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("专业")) {
	            		studentCustom.setMajor(sheet.getCell(j,i).getContents().toString().trim());
	            	}
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("学院")) {
	            		studentCustom.setColledge(sheet.getCell(j,i).getContents().toString().trim());
	            	}
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("是否通过")) {
	            		studentCustom.setPassed(Integer.parseInt(sheet.getCell(j,i).getContents().toString().trim()));
	            	}
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("分数")) {
	            		studentCustom.setScore(Integer.parseInt(sheet.getCell(j,i).getContents().toString().trim()));
	            	}
	            	if(sheet.getCell(j,0).getContents().toString().trim().equals("考试次数")) {
	            		studentCustom.setExamtimes(Integer.parseInt(sheet.getCell(j,i).getContents().toString().trim()));
	            	}
	            	
	            }
	            //teacherCustom.setTeacherrole(1);
	            if((studentCustom.getStudentno() != null || studentCustom.getStudentno().equals(""))&&(studentCustom.getScore() != null)) {
	            	int result = teacherMapperCustom.batchUpdateStudentScore(studentCustom.getStudentno(), studentCustom.getScore());
	            	if(result == 0) {
	            		return i ;
	            	}
	            }
	        }
		return -1;//代表执行完毕
	}
}
