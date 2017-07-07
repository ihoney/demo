package com.rainbow.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by caihongli on 2017/5/19.
 */
@SpringCloudApplication // 相当于@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker的组合
@EnableZuulProxy
public class ApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
