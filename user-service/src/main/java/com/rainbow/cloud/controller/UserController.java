package com.rainbow.cloud.controller;

import com.rainbow.cloud.message.StatusCode;
import com.rainbow.cloud.model.User;
import com.rainbow.cloud.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caihongli on 2017/5/19.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private DiscoveryClient client;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public User get(@PathVariable Long id) {
        ServiceInstance instance = client.getLocalServiceInstance();
        User user = userService.findById(id);
        log.info("code:{},msg1:{},msg2:{}", StatusCode.USER_NOT_EXISTS.code(),StatusCode.USER_NOT_EXISTS.message(),StatusCode.valueOfCode(StatusCode.USER_NOT_EXISTS.code(),"test").message());
        log.info("/user, host:" + instance.getHost() + ", serviceId: " + instance.getServiceId() + ",user id: " + user.getId() + ",category name: " + user.getUsername());
        return user;
    }

}
