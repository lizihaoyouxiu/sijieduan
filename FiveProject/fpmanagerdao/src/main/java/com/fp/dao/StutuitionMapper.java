package com.fp.dao;

import com.fp.pojo.Stutuition;
import com.fp.pojo.StutuitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StutuitionMapper {
    int countByExample(StutuitionExample example);

    int deleteByExample(StutuitionExample example);

    int deleteByPrimaryKey(Long stid);

    int insert(Stutuition record);

    int insertSelective(Stutuition record);

    List<Stutuition> selectByExample(StutuitionExample example);

    Stutuition selectByPrimaryKey(Long stid);

    int updateByExampleSelective(@Param("record") Stutuition record, @Param("example") StutuitionExample example);

    int updateByExample(@Param("record") Stutuition record, @Param("example") StutuitionExample example);

    int updateByPrimaryKeySelective(Stutuition record);

    int updateByPrimaryKey(Stutuition record);
}