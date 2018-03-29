package com.fp.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by DELL on 2018/3/29.
 */
@Controller
public class DayIncAction {


    @RequestMapping("/daylist")
    public ModelAndView daylist(HttpServletRequest request){
        ModelAndView mv =new ModelAndView();

        return mv;
    }
}
