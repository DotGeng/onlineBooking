package cn.cqupt.onlinebooking.mapper;

import cn.cqupt.onlinebooking.po.Systemdata;
import cn.cqupt.onlinebooking.po.SystemdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemdataMapper {
    int countByExample(SystemdataExample example);

    int deleteByExample(SystemdataExample example);

    int deleteByPrimaryKey(Integer systemdataid);

    int insert(Systemdata record);

    int insertSelective(Systemdata record);

    List<Systemdata> selectByExample(SystemdataExample example);

    Systemdata selectByPrimaryKey(Integer systemdataid);

    int updateByExampleSelective(@Param("record") Systemdata record, @Param("example") SystemdataExample example);

    int updateByExample(@Param("record") Systemdata record, @Param("example") SystemdataExample example);

    int updateByPrimaryKeySelective(Systemdata record);

    int updateByPrimaryKey(Systemdata record);
}