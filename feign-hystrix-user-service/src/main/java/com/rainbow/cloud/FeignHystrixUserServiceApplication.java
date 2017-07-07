package com.rainbow.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by caihongli on 2017/5/26.
 */
@SpringCloudApplication
@EnableFeignClients
@EnableDiscoveryClient
public class FeignHystrixUserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixUserServiceApplication.class, args);
    }
}
