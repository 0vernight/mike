package com.example.mike.controller;

import com.example.mike.bean.User;
import io.netty.handler.codec.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author: 23236
 * @date: 2021/4/3 13:50
 * @description:
 *主要是练习页面间的跳转
 *
 *
 */


//@RestController
    @Controller
public class MainController {

    @Autowired
    User user;


//    @RequestMapping({"/log","/*"})
    public String login(HttpRequest request,
                        HttpResponse response,
                        Model model,
                        @RequestParam String ss
    ){


        Map<String,Object> map=new HashMap<>();
//        session.getAttribute("user");

        System.out.println(ss);

        return "loginretur";
    }

    @RequestMapping("/main")
    @ResponseBody
    public String main(HttpServletRequest request,Model model){
        model.addAttribute("msg",request.getPathInfo());
        return "redirect:login";
    }

//    @ResponseBody想要返回数据的类型为json格式就可写restcontroller，或resposnsebody+controller
    @RequestMapping("/login")
//    @GetMapping(value = {"/","/login"})
    public String loginPage(){

        return "login";
    }
}
