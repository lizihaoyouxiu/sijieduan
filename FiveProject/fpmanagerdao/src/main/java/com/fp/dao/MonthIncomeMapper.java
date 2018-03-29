package com.fp.dao;

import com.fp.pojo.MonthIncome;
import com.fp.pojo.MonthIncomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonthIncomeMapper {
    int countByExample(MonthIncomeExample example);

    int deleteByExample(MonthIncomeExample example);

    int deleteByPrimaryKey(Long mid);

    int insert(MonthIncome record);

    int insertSelective(MonthIncome record);

    List<MonthIncome> selectByExample(MonthIncomeExample example);

    MonthIncome selectByPrimaryKey(Long mid);

    int updateByExampleSelective(@Param("record") MonthIncome record, @Param("example") MonthIncomeExample example);

    int updateByExample(@Param("record") MonthIncome record, @Param("example") MonthIncomeExample example);

    int updateByPrimaryKeySelective(MonthIncome record);

    int updateByPrimaryKey(MonthIncome record);
}