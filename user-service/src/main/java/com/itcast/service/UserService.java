package com.itcast.service;

import com.itcast.entity.User;
import com.itcast.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User queryById(Long id) {
        return userMapper.findById(id);
    }
}