package cn.cqupt.onlinebooking.mapper;

import cn.cqupt.onlinebooking.po.Studentbooking;
import cn.cqupt.onlinebooking.po.StudentbookingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentbookingMapper {
    int countByExample(StudentbookingExample example);

    int deleteByExample(StudentbookingExample example);

    int deleteByPrimaryKey(Integer studentbookingid);

    int insert(Studentbooking record);

    int insertSelective(Studentbooking record);

    List<Studentbooking> selectByExample(StudentbookingExample example);

    Studentbooking selectByPrimaryKey(Integer studentbookingid);

    int updateByExampleSelective(@Param("record") Studentbooking record, @Param("example") StudentbookingExample example);

    int updateByExample(@Param("record") Studentbooking record, @Param("example") StudentbookingExample example);

    int updateByPrimaryKeySelective(Studentbooking record);

    int updateByPrimaryKey(Studentbooking record);
}