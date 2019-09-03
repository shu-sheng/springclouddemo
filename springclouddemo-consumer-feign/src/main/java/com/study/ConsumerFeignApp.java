package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.study.service")
public class ConsumerFeignApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApp.class,args);
    }

}
