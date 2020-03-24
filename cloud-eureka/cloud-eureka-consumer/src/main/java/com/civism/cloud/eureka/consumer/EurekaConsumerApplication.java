package com.civism.cloud.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : civism
 * @version 1.0
 * @projectName：civism-cloud
 * @className：EurekaConsumerApplication
 * @date 2020/3/17 10:45 上午
 * @E-mail:695234456@qq.com
 * @Copyright: 版权所有 (C) 2020 civism
 * @return
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApplication.class, args);
    }
}
