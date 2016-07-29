package cn.cqupt.onlinebooking.handler;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;



import cn.cqupt.Util.DownloadUtil;
import cn.cqupt.onlinebooking.po.ScoreCustome;
import cn.cqupt.onlinebooking.po.StudentCustom;
import cn.cqupt.onlinebooking.po.TeacherCustom;
import cn.cqupt.onlinebooking.service.StudentService;
import cn.cqupt.onlinebooking.service.TeacherService;
import cn.cqupt.onlinebooking.service.UploadOrDowLoadService;

@Controller
public class UploadOrDownloadController {
	@Autowired
	private UploadOrDowLoadService uploadOrDowLoadService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private StudentService studentService;
	@RequestMapping("batchImportTeacher")
	public ModelAndView addTeacherInformation(MultipartFile file) throws Exception {
		uploadOrDowLoadService.uploadTeacher(file);
		List<TeacherCustom> teacherList = teacherService.getAllTeacher(null);
		Iterator<TeacherCustom> iterator = teacherList.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getTeacherrole().equals(0)) {
				iterator.remove();
			}
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("teacherList",teacherList);
		modelAndView.setViewName("teacher/user");
		return modelAndView;
	}
	@RequestMapping("batchImportStudents")
	public ModelAndView addStudentInforamtion(MultipartFile file) throws Exception {
		uploadOrDowLoadService.uploadStudents(file);
		List<StudentCustom> studentList = studentService.findStudentList(null);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("studentList", studentList);
		modelAndView.setViewName("students/studentList");
		return modelAndView;
	}
	@RequestMapping("batchUpdateStudentScore")
	public ModelAndView batchUpdateStudentScore(MultipartFile file) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		int i = uploadOrDowLoadService.batchUpdateStudentScore(file);
		if(i > 0) {
			System.out.println(i +"成绩修改失败 ");
			modelAndView.addObject("information","第"+i+"条以后的数据导入失败(包括第"+i+"条数据)");
			modelAndView.setViewName("students/batchResultUploadStudentScore");
			return modelAndView;
		}else if(i == -1){
			modelAndView.addObject("information","成绩全部导入成功");
			modelAndView.setViewName("students/batchResultUploadStudentScore");
			return modelAndView;
		}
		return null;
	}
	@RequestMapping("exprorScoreExcel")
	public ModelAndView exprorScoreExcel() throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}
	//模板文件开发,批量导出学生成绩
	@RequestMapping("batchExportStudentsScore")
	public void batchExportStudentsScore(String year,Integer upOrDownTeam,HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		String path = request.getSession().getServletContext().getRealPath("/")+"/template/";
		InputStream is=  new FileInputStream(new File(path+"tOUTPRODUCT.xls"));
		Workbook wb = new HSSFWorkbook(is);
		Sheet sheet = wb.getSheetAt(0);
		Row nRow = null;
		Cell nCell = null;
		int rowNo = 0;
		int colNo = 1;
		// 获取模板上的单元格格式
		nRow = sheet.getRow(2);
		//学号单元格的格式
		nCell = nRow.getCell(1);
		CellStyle studentNoStyle = nCell.getCellStyle();
		//学生姓名单元格的格式
		nCell  = nRow.getCell(2);
		CellStyle studentNameStyle = nCell.getCellStyle();
		//分数单元格的格式
		nCell = nRow.getCell(3);
		CellStyle scoreCellStyle = nCell.getCellStyle();
		//学院单元格格式
		nCell = nRow.getCell(4);
		CellStyle colledgeCellStyle = nCell.getCellStyle();
		//专业单元格格式
		nCell = nRow.getCell(5);
		CellStyle majorCellStye = nCell.getCellStyle();
		//学年单元格格式
		nCell = nRow.getCell(6);
		CellStyle yearCellStyle = nCell.getCellStyle();
		//学期单元格格式
		nCell = nRow.getCell(7);
		CellStyle termCellStyle = nCell.getCellStyle();
		
		//处理大标题
		nRow = sheet.getRow(rowNo++); // 获取一个行对象
		nCell = nRow.getCell(colNo); // 获得一个单元格对象
		String term = "";
		if(upOrDownTeam == 0) {
			 term = String.valueOf(upOrDownTeam).replaceFirst("0", "春季");
		}else if(upOrDownTeam == 1) {
			 term = String.valueOf(upOrDownTeam).replaceFirst("1", "秋季");
		}
		
		nCell.setCellValue("成绩表");
		rowNo++;
		
		//处理内容
		List<ScoreCustome> scoreCustomeList = studentService.getScoreByYearTerm(year, upOrDownTeam);
		for(int j = 0; j < scoreCustomeList.size(); j++) {
			colNo = 1;
			ScoreCustome scoreCustome = scoreCustomeList.get(j);
			
			nRow = sheet.createRow(rowNo++);
			nRow.setHeightInPoints(24);
			
			nCell = nRow.createCell(colNo++);
			nCell.setCellValue(scoreCustome.getStudentno());
			nCell.setCellStyle(studentNoStyle);
			
			nCell = nRow.createCell(colNo++);
			nCell.setCellValue(scoreCustome.getStudentname());
			nCell.setCellStyle(studentNameStyle);
			
			nCell = nRow.createCell(colNo++);
			nCell.setCellValue(scoreCustome.getScore());
			nCell.setCellStyle(scoreCellStyle);
			
			nCell = nRow.createCell(colNo++);
			nCell.setCellValue(scoreCustome.getColledge());
			nCell.setCellStyle(colledgeCellStyle);
			
			nCell = nRow.createCell(colNo++);
			nCell.setCellValue(scoreCustome.getMajor());
			nCell.setCellStyle(majorCellStye);
			
			nCell = nRow.createCell(colNo++);
			nCell.setCellValue(scoreCustome.getYear());
			nCell.setCellStyle(yearCellStyle);
			
			nCell = nRow.createCell(colNo++);
			nCell.setCellValue("");
			
			nCell.setCellStyle(termCellStyle);
		}
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		wb.write(os);
		
		DownloadUtil downloadUtil = new DownloadUtil();
		downloadUtil.download(os, response, "成绩表.xls");
		
		os.flush();
		os.close();
	}
}
