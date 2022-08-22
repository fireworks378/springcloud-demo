package com.itcast.feignClients;

import com.itcast.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("userservice")
public interface UserClient {

    @GetMapping("user/{id}")
    User getUser(@PathVariable("id") Long id);
}
