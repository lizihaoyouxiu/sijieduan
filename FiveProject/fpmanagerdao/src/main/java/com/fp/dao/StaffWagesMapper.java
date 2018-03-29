package com.fp.dao;

import com.fp.pojo.StaffWages;
import com.fp.pojo.StaffWagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffWagesMapper {
    int countByExample(StaffWagesExample example);

    int deleteByExample(StaffWagesExample example);

    int deleteByPrimaryKey(Long wid);

    int insert(StaffWages record);

    int insertSelective(StaffWages record);

    List<StaffWages> selectByExample(StaffWagesExample example);

    StaffWages selectByPrimaryKey(Long wid);

    int updateByExampleSelective(@Param("record") StaffWages record, @Param("example") StaffWagesExample example);

    int updateByExample(@Param("record") StaffWages record, @Param("example") StaffWagesExample example);

    int updateByPrimaryKeySelective(StaffWages record);

    int updateByPrimaryKey(StaffWages record);


}