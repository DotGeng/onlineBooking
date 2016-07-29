package cn.cqupt.onlinebooking.mapper;

import java.util.List;

import cn.cqupt.onlinebooking.po.PeriodCustome;



public interface PeriodMapperCustome extends PeriodMapper{
	//得到节数的名字和id
	public List<PeriodCustome> getPeriodNameAndID() throws Exception;
	//得到所有的节数信息
	public List<PeriodCustome> getPeriodInformation() throws Exception;
	//增加period信息
	public void addPeriodInformation(PeriodCustome periodCustome) throws Exception;
	//删除节次信息
	public void deletePeriodInformation(PeriodCustome periodCustome) throws Exception;
	//根据periodid查找监考表中是否含有该条记录下的考试信息
	public int getExamCountByPeriodId(Integer periodId) throws Exception;
	//得到共有几节课
	public int getCountPeriod() throws Exception;
}