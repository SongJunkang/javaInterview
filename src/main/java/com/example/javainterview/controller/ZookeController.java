package com.example.javainterview.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author joakims
 * @create 2022-09-28-20:24
 **/

@RestController
public class ZookeController {


//    @Value("${age}")
//    public String  age ;

    @RequestMapping("ver")
    public String zook(){


        return "hello world" ;
    }

    @ResponseBody
    public void welcome(Model model){

    }

    @ResponseBody
    @RequestMapping("/hello")   //意为请求 localhost:8080/hello
    public String hello(Model model){
        //封装数据（向模型中添加数据，可以jsp页面直接取出并渲染）
        model.addAttribute("name","张三");
        model.addAttribute("sex","男");
        model.addAttribute("age",23);
        System.out.println(model);

        //会被视图解析器处理
        return  "hello"  ;//返回到哪个页面
    }





}
