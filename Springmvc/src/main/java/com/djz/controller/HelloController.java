package com.djz.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author djz
 * @date 2020/11/20 -8:56
 */
public class HelloController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //模型和视图
        ModelAndView mv=new ModelAndView();
        //封装对象
        mv.addObject("msg","Hello SpringMVC !");
        //封装要跳转的视图
        mv.setViewName("hello");
        return mv;
    }
}
