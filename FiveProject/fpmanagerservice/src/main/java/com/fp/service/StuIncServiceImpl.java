package com.fp.service;

import com.fp.dao.StutuitionMapper;
import com.fp.dao.UUserMapper;
import com.fp.dto.StuDto;
import com.fp.pojo.Stutuition;
import com.fp.pojo.StutuitionExample;
import com.fp.pojo.UUser;
import com.fp.pojo.UUserExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzh.dto.PageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2018/3/27.
 */
@Service
public class StuIncServiceImpl implements StuIncService {

    @Autowired
    private StutuitionMapper stutuitionMapper;

    @Autowired
    private UUserMapper uUserMapperl;

    @Override
    public PageDto findByPage(Integer page, Integer rows,String stuname) {
        PageDto pageDto = new PageDto();
        PageHelper.startPage(page,rows);
        StutuitionExample example = new StutuitionExample();
        if(stuname!=null){
            UUserExample uexample = new UUserExample();
            UUserExample.Criteria criteria1 = uexample.createCriteria();
            criteria1.andUsernameLike("%"+stuname+"%");
            List<Long> ids = new ArrayList<>();
            List<UUser> uUsers = uUserMapperl.selectByExample(uexample);
            for (UUser uUser : uUsers) {
                ids.add(uUser.getUid());
            }
            StutuitionExample.Criteria criteria = example.createCriteria();
            criteria.andUidIn(ids);
        }
        List<Stutuition> stutuitions = stutuitionMapper.selectByExample(example);
        PageInfo<Stutuition> pageInfo = new PageInfo<Stutuition>(stutuitions);
        long total = pageInfo.getTotal();
        pageDto.setTotal(total);
        List<StuDto> list = new ArrayList<StuDto>();
        for (Stutuition stutuition : stutuitions) {
            StuDto stuDto = new StuDto();
            stuDto.setId(stutuition.getStid());
            Long uid = stutuition.getUid();
            UUser uUser = uUserMapperl.selectByPrimaryKey(uid);
            stuDto.setStuname(uUser.getUsername());
            Short state = stutuition.getState();
            if(state==1) {
                stuDto.setStustate("已缴费");
            }else{
                stuDto.setStustate("未交费");
            }
            stuDto.setTuition(stutuition.getTuition()+"");
            stuDto.setCreatedAt("111111");
            list.add(stuDto);
        }
        pageDto.setRows(list);
        return pageDto;
    }
}
