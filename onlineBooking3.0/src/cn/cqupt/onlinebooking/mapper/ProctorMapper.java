package cn.cqupt.onlinebooking.mapper;

import cn.cqupt.onlinebooking.po.Proctor;
import cn.cqupt.onlinebooking.po.ProctorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProctorMapper {
    int countByExample(ProctorExample example);

    int deleteByExample(ProctorExample example);

    int deleteByPrimaryKey(Integer examid);

    int insert(Proctor record);

    int insertSelective(Proctor record);

    List<Proctor> selectByExample(ProctorExample example);

    Proctor selectByPrimaryKey(Integer examid);

    int updateByExampleSelective(@Param("record") Proctor record, @Param("example") ProctorExample example);

    int updateByExample(@Param("record") Proctor record, @Param("example") ProctorExample example);

    int updateByPrimaryKeySelective(Proctor record);

    int updateByPrimaryKey(Proctor record);
}