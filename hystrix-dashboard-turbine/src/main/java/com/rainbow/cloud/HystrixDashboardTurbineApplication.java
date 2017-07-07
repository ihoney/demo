package com.rainbow.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by caihongli on 2017/6/1.
 */
@EnableTurbine
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboardTurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardTurbineApplication.class, args);
    }
}
