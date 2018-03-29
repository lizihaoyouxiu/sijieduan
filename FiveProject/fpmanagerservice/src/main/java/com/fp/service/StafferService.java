package com.fp.service;

import com.lzh.dto.PageDto;

/**
 * Created by DELL on 2018/3/28.
 */
public interface StafferService {

    public PageDto stafferList(Integer page,Integer rows,String staffername);
}
