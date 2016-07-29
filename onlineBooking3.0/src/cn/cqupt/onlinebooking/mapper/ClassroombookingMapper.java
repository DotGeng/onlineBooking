package cn.cqupt.onlinebooking.mapper;

import cn.cqupt.onlinebooking.po.Classroombooking;
import cn.cqupt.onlinebooking.po.ClassroombookingExample;
import cn.cqupt.onlinebooking.po.ClassroombookingKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassroombookingMapper {
    int countByExample(ClassroombookingExample example);

    int deleteByExample(ClassroombookingExample example);

    int deleteByPrimaryKey(ClassroombookingKey key);

    int insert(Classroombooking record);

    int insertSelective(Classroombooking record);

    List<Classroombooking> selectByExample(ClassroombookingExample example);

    Classroombooking selectByPrimaryKey(ClassroombookingKey key);

    int updateByExampleSelective(@Param("record") Classroombooking record, @Param("example") ClassroombookingExample example);

    int updateByExample(@Param("record") Classroombooking record, @Param("example") ClassroombookingExample example);

    int updateByPrimaryKeySelective(Classroombooking record);

    int updateByPrimaryKey(Classroombooking record);
}