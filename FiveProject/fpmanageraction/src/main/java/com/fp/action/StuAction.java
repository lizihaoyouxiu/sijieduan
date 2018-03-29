package com.fp.action;

import com.fp.dto.StuDto;
import com.fp.service.StuIncService;
import com.lzh.dto.PageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by DELL on 2018/3/27.
 */

@Controller
public class StuAction {

    @Autowired
    private StuIncService stuIncService;


    @RequestMapping("/stulist")
    public ModelAndView stulist(HttpSession session,String flag, Integer currentPage, String stuname){
        ModelAndView mv =new ModelAndView();
        if("false".equals(flag)){
            session.setAttribute("stuname",stuname);
        }else if("true".equals(flag)){
            session.removeAttribute("stuname");
            stuname=null;
        }else{
            stuname= (String) session.getAttribute("stuname");
        }
        if(currentPage == null){
            currentPage = 0;
        }
        Integer rows = 5;
        PageDto byPage = stuIncService.findByPage(currentPage+1, rows,stuname);
        long total = byPage.getTotal();
        int count = (int)(total + rows -1) / rows;
        List<StuDto> stulist = byPage.getRows();
        mv.addObject("stulist",stulist);
        mv.addObject("currentPage",currentPage);
        mv.addObject("totalPage",count);
        mv.setViewName("view/finance/stulist");
        return mv;
    }

}
