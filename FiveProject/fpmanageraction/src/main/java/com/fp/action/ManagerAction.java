package com.fp.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DELL on 2018/3/27.
 */
@Controller
public class ManagerAction {

    @RequestMapping("/{page}")
    public String goToPage(@PathVariable String page){
        return page;//返回页面的的动态地址。
    }
}
