package com.rainbow.cloud.trace.registry;

import com.rainbow.cloud.base.constant.Constants;
import com.rainbow.cloud.trace.dto.RegisterDto;
import com.rainbow.cloud.trace.generater.IdGen;
import com.rainbow.cloud.trace.generater.IncrementIdGen;
import org.I0Itec.zkclient.ZkClient;

/**
 *  利用zookeeper实现注册中心
 * Created by caihongli on 2017/7/6.
 */
public class ZookeeperRegistry implements Registry {

    /**
     * 向注册中心进行注册，生成该服务的编号并返回
     * @param registerDto
     * @return
     */
    @Override
    public String register(RegisterDto registerDto) {
        String host = registerDto.getHost();
        String app = registerDto.getApp();

        // 向注册中心注册
        ZkClient zkClient = registerDto.getZkClient();
        zkClient.createPersistent(Constants.ZK_REGISTRY_SERVICE_ROOT_PATH + Constants.SLASH + app, true);
        IdGen idGen = new IncrementIdGen(registerDto);
        String id = idGen.nextId();
        zkClient.createEphemeral(Constants.ZK_REGISTRY_SERVICE_ROOT_PATH + Constants.SLASH + app + Constants.SLASH + host, id);

        return id;
    }
}
