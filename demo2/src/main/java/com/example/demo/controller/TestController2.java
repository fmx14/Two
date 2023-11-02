package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @author FMX
 * @Date 2023/10/31
 */
@RestController
@RequestMapping(value = "/test")
public class TestController2 {
    @RequestMapping(value = "/t", method = RequestMethod.GET)
    public String  review(){
        System.out.println("hello");
        return "hello";
    }

}
