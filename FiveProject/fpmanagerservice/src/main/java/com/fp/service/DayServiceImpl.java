package com.fp.service;

import com.fp.dao.DayIncomeMapper;
import com.fp.pojo.DayIncomeExample;
import com.lzh.dto.PageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by DELL on 2018/3/29.
 */
@Service
public class DayServiceImpl implements DayService {

    @Autowired
    private DayIncomeMapper dayIncomeMapper;

    @Override
    public PageDto daysList(Integer page, Integer rows, String day) {
        DayIncomeExample example = new DayIncomeExample();
        dayIncomeMapper.selectByExample(example);
        return null;
    }
}
