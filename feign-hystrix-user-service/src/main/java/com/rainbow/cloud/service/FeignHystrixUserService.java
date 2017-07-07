package com.rainbow.cloud.service;

import com.rainbow.cloud.entity.User;
import com.rainbow.cloud.service.fallback.FeignHystrixUserServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by caihongli on 2017/5/26.
 */
@FeignClient(name = "user-service", fallback = FeignHystrixUserServiceFallback.class)
public interface FeignHystrixUserService {

    @RequestMapping("/user/{id}")
    public User findByIdFeign(@RequestParam("id") Long id);
}
