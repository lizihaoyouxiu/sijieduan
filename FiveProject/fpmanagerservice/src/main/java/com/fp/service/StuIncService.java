package com.fp.service;

import com.lzh.dto.PageDto;

/**
 * Created by DELL on 2018/3/27.
 */
public interface StuIncService {

    public PageDto findByPage(Integer page,Integer rows,String stuname);
}
