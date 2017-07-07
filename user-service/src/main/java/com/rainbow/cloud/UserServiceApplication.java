package com.rainbow.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.logging.LoggingApplicationListener;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by caihongli on 2017/5/19.
 */
@SpringCloudApplication
@EnableDiscoveryClient
public class UserServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(UserServiceApplication.class, args);
//        SpringApplicationBuilder builder = new SpringApplicationBuilder(UserServiceApplication.class);
//        Set<ApplicationListener<?>> listeners = builder.application().getListeners();
//        for (Iterator<ApplicationListener<?>> it = listeners.iterator(); it.hasNext();) {
//            ApplicationListener<?> listener = it.next();
//            if (listener instanceof LoggingApplicationListener) {
//                it.remove();
//            }
//        }
//        builder.application().setListeners(listeners);
//        ConfigurableApplicationContext context = builder.run(args);
    }
}
