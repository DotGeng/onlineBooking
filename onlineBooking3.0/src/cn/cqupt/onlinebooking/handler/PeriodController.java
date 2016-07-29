package cn.cqupt.onlinebooking.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.cqupt.onlinebooking.po.Period;
import cn.cqupt.onlinebooking.po.PeriodCustome;
import cn.cqupt.onlinebooking.service.PeriodService;

@Controller
public class PeriodController {
	@Autowired
	private PeriodService periodService;
	
	@RequestMapping("getPeriodList")
	public ModelAndView getPeriodList() throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		List<PeriodCustome> periodCustomeList = periodService.getPeriodInformation();
		modelAndView.addObject("periodCustomeList", periodCustomeList);
		modelAndView.setViewName("teacher/periodList");
		return modelAndView;
	}
	@RequestMapping("addPeriodPage")
	public ModelAndView addPeriodPage() throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("teacher/addPeriodPage");
		return modelAndView;
	}
	@RequestMapping("addPeriodToDB")
	public ModelAndView addPeriodInformation(PeriodCustome periodCustome) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		Integer i = periodService.addPeriodInformation(periodCustome);
		if(i == -1) {
			//以为数据库中含有重复的数据，所以添加失败
			modelAndView.setViewName("teacher/addPeriodError");
			return modelAndView;
		}
		return getPeriodList();
	}
	//删除节次信息
	@RequestMapping("deletePeriodInformationFromDB")
	public ModelAndView deletePeriodInformation(PeriodCustome periodCustome) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		int i = periodService.deletePeriodInformation(periodCustome);
		if(i > 0) {
			modelAndView.setViewName("teacher/deletePeriodError");
			return modelAndView;
		}
		
		return getPeriodList();
	}
}
