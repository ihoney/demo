package com.rainbow.cloud.service;

import com.rainbow.cloud.model.User;

/**
 * Created by caihongli on 2017/5/19.
 */
public interface UserService {

    User findByUserName(String userName);

    void saveUser(User user);

    User findById(Long id);
}
