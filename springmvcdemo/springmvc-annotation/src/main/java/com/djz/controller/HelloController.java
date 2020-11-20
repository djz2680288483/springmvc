package com.djz.controller;

import com.djz.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.converter.ObjectToStringHttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author djz
 * @date 2020/11/20 -11:15
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/h1")
    public String hello(Model model) {

        model.addAttribute("msg", "SpringMVC hello Test");
        return "hello";
    }

    @GetMapping("/h2")
    @ResponseBody
    public String hello2() {

        return "hello test";
    }

    @GetMapping("/h3")
    @ResponseBody
    public String hello3() throws JsonProcessingException {
        User user=new User();
        user.setName("lisi");
        user.setAge(22);
        user.setHobbys(Arrays.asList("sing","dance","run"));
        Map<String,Object> map=new  HashMap();
        map.put("身份证","52223199711210123");
        map.put("银行卡","683748732210123");
        user.setKey(map);

      ObjectMapper objectMapper=new ObjectMapper();
    String str=  objectMapper.writeValueAsString(user);
        return str;
    }


}
