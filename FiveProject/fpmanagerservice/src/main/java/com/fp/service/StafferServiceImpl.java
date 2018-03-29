package com.fp.service;

import com.fp.dao.EmployeeMapper;
import com.fp.dao.StaffWagesMapper;
import com.fp.dto.StafferDto;
import com.fp.pojo.Employee;
import com.fp.pojo.EmployeeExample;
import com.fp.pojo.StaffWages;
import com.fp.pojo.StaffWagesExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzh.dto.PageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2018/3/28.
 */
@Service
public class StafferServiceImpl implements StafferService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private StaffWagesMapper staffWagesMapper;

    @Override
    public PageDto stafferList(Integer page, Integer rows, String staffername) {
        PageDto pageDto = new PageDto();
        PageHelper.startPage(page,rows);
        StaffWagesExample example1 = new StaffWagesExample();
        if(staffername!=null){
            EmployeeExample example = new EmployeeExample();
            EmployeeExample.Criteria criteria = example.createCriteria();
            criteria.andEmployeeNameLike("%"+staffername+"%");
            List<Long> ids = new ArrayList<>();
            List<Employee> employees = employeeMapper.selectByExample(example);
            for (Employee employee : employees) {
                ids.add((employee.getEmployeeId()).longValue());
            }
            StaffWagesExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andUidIn(ids);
        }
        List<StaffWages> staffWages = staffWagesMapper.selectByExample(example1);
        PageInfo<StaffWages> pageInfo = new PageInfo<StaffWages>();
        long total = pageInfo.getTotal();
        List<StafferDto> list = new ArrayList<>();
        for (StaffWages staffWage : staffWages) {
            StafferDto stafferDto = new StafferDto();
            stafferDto.setId(staffWage.getWid());
            Short state = staffWage.getState();
            if(state==1){
                stafferDto.setStafferstate("已发放");
            }else{
                stafferDto.setStafferstate("暂未发放");
            }
            Double wage = staffWage.getWage();
            Double taxrate = staffWage.getTaxrate();
            Double quickmoney = staffWage.getQuickmoney();
            double wages = wage-(wage*taxrate-quickmoney);
            stafferDto.setStafferwages(wages+"");
            stafferDto.setCreatedAt("111111");
            Long uid = staffWage.getUid();
            Employee employee = employeeMapper.selectByPrimaryKey((double) uid);
            stafferDto.setStaffername(employee.getEmployeeName());
            list.add(stafferDto);
        }
        pageDto.setTotal(total);
        pageDto.setRows(list);
        return pageDto;
    }
}
