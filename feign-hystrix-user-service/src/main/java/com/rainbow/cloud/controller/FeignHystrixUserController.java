package com.rainbow.cloud.controller;

import com.rainbow.cloud.entity.User;
import com.rainbow.cloud.service.FeignHystrixUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caihongli on 2017/5/26.
 */
@RestController
public class FeignHystrixUserController {

    @Autowired
    private FeignHystrixUserService feignHystrixUserService;

    @GetMapping("feign/{id}")
    public User findByIdFeign(@PathVariable Long id) {
        User user = feignHystrixUserService.findByIdFeign(id);
        return user;
    }

}
