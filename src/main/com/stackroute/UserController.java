package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class UserController {

        @RequestMapping("/add")
        public ModelAndView getName(HttpServletRequest request, HttpServletResponse response){
            User user = new User();
            String str=request.getParameter("t1");
            user.setUserName(str);
            String k = user.getUserName();
            ModelAndView modelAndView=new ModelAndView();
            modelAndView.setViewName("display");
            modelAndView.addObject("result",k);
            return modelAndView;
        }
}


