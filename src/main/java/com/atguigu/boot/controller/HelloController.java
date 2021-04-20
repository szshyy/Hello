package com.atguigu.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(){
        log.error("请求进来了...");
        return "Hello,Spring Boot2!";
    }
}
