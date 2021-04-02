package com.cr.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： chenr
 * @date： Created on 2021/3/30 22:06
 * @version： v1.0
 * @modified By:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/str")
    public String hello(){
        return "hello  spring-boot 2.3.3";
    }
}
