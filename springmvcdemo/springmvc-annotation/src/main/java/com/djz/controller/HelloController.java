package com.djz.controller;

import com.alibaba.fastjson.JSON;
import com.djz.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
        User user=new User();
        user.setName("lisi");
        user.setAge(22);
        user.setHobbys(Arrays.asList("sing","dance","run"));
        Map<String,Object> map=new  HashMap();
        map.put("身份证","52223199711210123");
        map.put("银行卡","683748732210123");
        user.setKey(map);

        model.addAttribute("msg", user.toString());
        return "hello";
    }

    @RequestMapping("/h2")
    @ResponseBody
    public String hello2() {

        return "hello test";
    }

    @RequestMapping("/h3")
    @ResponseBody
    public String hello3()  {
        User user=new User();
        user.setName("lisi");
        user.setAge(22);
        user.setHobbys(Arrays.asList("sing","dance","run"));
        Map<String,Object> map=new  HashMap();
        map.put("id","52223199711210123");
        map.put("bank","683748732210123");
        user.setKey(map);

     String str=   JSON.toJSONString(user);

        return  str;
    }


}
