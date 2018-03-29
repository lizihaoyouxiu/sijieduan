package com.fp.dao;

import com.fp.pojo.DayIncome;
import com.fp.pojo.DayIncomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DayIncomeMapper {
    int countByExample(DayIncomeExample example);

    int deleteByExample(DayIncomeExample example);

    int deleteByPrimaryKey(Long did);

    int insert(DayIncome record);

    int insertSelective(DayIncome record);

    List<DayIncome> selectByExample(DayIncomeExample example);

    DayIncome selectByPrimaryKey(Long did);

    int updateByExampleSelective(@Param("record") DayIncome record, @Param("example") DayIncomeExample example);

    int updateByExample(@Param("record") DayIncome record, @Param("example") DayIncomeExample example);

    int updateByPrimaryKeySelective(DayIncome record);

    int updateByPrimaryKey(DayIncome record);
}