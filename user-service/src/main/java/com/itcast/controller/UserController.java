package com.itcast.controller;

import com.itcast.entity.User;
import com.itcast.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RefreshScope
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @Value("${service}")
    private String service ;

    @GetMapping("/get")
    public String get() {
        return service;
    }
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id,@RequestHeader(value = "truth",required = false) String truth) {
        System.out.println("truth==>"+truth);
        return userService.queryById(id);
    }
}
