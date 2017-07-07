package com.rainbow.cloud.service.fallback;

import com.rainbow.cloud.entity.User;
import com.rainbow.cloud.service.FeignHystrixUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by caihongli on 2017/5/26.
 */
@Component
public class FeignHystrixUserServiceFallback implements FeignHystrixUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FeignHystrixUserServiceFallback.class);

    /**
     * hystrix fallback方法
     * @param id id
     * @return 默认的用户
     */
    @Override
    public User findByIdFeign(Long id) {
        FeignHystrixUserServiceFallback.LOGGER.info("异常发生，进入fallback方法，接收的参数：id = {}", id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        return user;
    }
}
