package cn.cqupt.onlinebooking.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.cqupt.onlinebooking.mapper.PeriodMapperCustome;
import cn.cqupt.onlinebooking.po.PeriodCustome;
import cn.cqupt.onlinebooking.service.PeriodService;

public class PeriodServiceImpl implements PeriodService{
	@Autowired
	private PeriodMapperCustome periodMapperCustome;
	
	public List<PeriodCustome> getPeriodNameAndID() throws Exception {
		
		return periodMapperCustome.getPeriodNameAndID();
	}

	public List<PeriodCustome> getPeriodInformation() throws Exception {
		
		return periodMapperCustome.getPeriodInformation();
	}

	public Integer addPeriodInformation(PeriodCustome periodCustome) throws Exception {
		List<PeriodCustome> periodCustomeList = getPeriodNameAndID();
		for (PeriodCustome periodCustomeTmp : periodCustomeList) {
			if(periodCustomeTmp.getPeriodname().trim()
					.equals(periodCustome.getPeriodname())
					|| periodCustomeTmp.getPeriodid()==periodCustome.getPeriodid()) {
				return -1;//返回-1代表数据库中存在这个名字的节次记录
			}
		}
		periodMapperCustome.addPeriodInformation(periodCustome);
		return 1;
	}

	public Integer deletePeriodInformation(PeriodCustome periodCustome)
			throws Exception {
		//查询proctor表中是否有该节次记录，有的话，不允许删除
		int i = periodMapperCustome.getExamCountByPeriodId(periodCustome.getPeriodid());
		if(i > 0) {
			return i;
		}
		periodMapperCustome.deletePeriodInformation(periodCustome);
		return 0;
	}

}
