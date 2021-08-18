package com.geoway.webstore.controller;

import com.geoway.webstore.anno.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lencho
 * @create 2021-08-18 19:30
 */
@RestController
@RequestMapping("/lencho")
@ResponseResult
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello,springboot";
    }

    @GetMapping("/hello2")
    public String hello2() {
        Integer num = 10 / 0;
        return "hello2";
    }
}
