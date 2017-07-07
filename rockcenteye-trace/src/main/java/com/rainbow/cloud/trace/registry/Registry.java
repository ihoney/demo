package com.rainbow.cloud.trace.registry;

import com.rainbow.cloud.trace.dto.RegisterDto;

/**
 * 注册中心注册器
 * Created by caihongli on 2017/7/6.
 */
public interface Registry {
    /**
     * 对服务进行注册
     * @return 返回注册serviceID
     */
    String register(RegisterDto registerDto);
}
