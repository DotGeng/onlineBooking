package cn.cqupt.onlinebooking.service;

import java.util.List;

import cn.cqupt.onlinebooking.po.PeriodCustome;

public interface PeriodService {
	//得到节数的名字和id
	public List<PeriodCustome> getPeriodNameAndID() throws Exception;
	//得到所有的节数信息
	public List<PeriodCustome> getPeriodInformation() throws Exception;
	//增加period信息
	public Integer addPeriodInformation(PeriodCustome periodCustome) throws Exception;
	//删除节次信息
	public Integer deletePeriodInformation(PeriodCustome periodCustome) throws Exception;
}
