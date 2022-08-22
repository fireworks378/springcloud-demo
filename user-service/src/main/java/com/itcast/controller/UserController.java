package com.itcast.controller;

import com.itcast.entity.User;
import com.itcast.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 路径： /user/110
     *
     * @param id 用户id
     * @return 用户
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id, @RequestHeader(value = "Truth",required = false) String Truth ,@RequestHeader(value = "truth",required = false) String truth) {
        System.out.println("Truth==>"+Truth);
        System.out.println("truth==>"+truth);
        return userService.queryById(id);
    }
}
