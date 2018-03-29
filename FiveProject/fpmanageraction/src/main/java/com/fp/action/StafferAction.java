package com.fp.action;

import com.fp.dto.StafferDto;
import com.fp.service.StafferService;
import com.fp.service.StafferServiceImpl;
import com.lzh.dto.PageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by DELL on 2018/3/28.
 */
@Controller
public class StafferAction {

    @Autowired
    private StafferService stafferService;

    @RequestMapping("/stafflist")
    public ModelAndView stafflist(HttpSession session, String flag, Integer currentPage, String staffername){
        ModelAndView mv =new ModelAndView();
        if("false".equals(flag)){
            session.setAttribute("staffername",staffername);
        }else if("true".equals(flag)){
            session.removeAttribute("session");
            staffername = null;
        }else{
            staffername = (String) session.getAttribute("staffername");
        }

        if(currentPage == null){
            currentPage =0 ;
        }
        Integer rows = 5;
        PageDto pageDto = stafferService.stafferList(currentPage+1, rows, staffername);
        long total = pageDto.getTotal();
        int count = (int)(total + rows -1) / rows;
        List<StafferDto> rows1 = pageDto.getRows();
        mv.addObject("stulist",rows1);
        mv.addObject("currentPage",currentPage);
        mv.addObject("totalPage",count);
        mv.setViewName("view/finance/stafflist");
        return mv;
    }
}
