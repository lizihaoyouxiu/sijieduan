package com.fp.service;

import com.lzh.dto.PageDto;

/**
 * Created by DELL on 2018/3/29.
 */
public interface DayService {

    public PageDto daysList(Integer page,Integer rows,String day);
}
