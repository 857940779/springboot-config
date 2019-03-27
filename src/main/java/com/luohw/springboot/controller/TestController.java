package com.luohw.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luohw on 2018/5/2 0002.
 */

//该注解需要引入 spring-boot-starter-web
@RestController
public class TestController {



    @RequestMapping("/test")
    public String index(){
        return "the server start success !!!";
    }
}
