package com.civism.cloud.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : civism
 * @version 1.0
 * @projectName：civism-cloud
 * @className：EurekaClientApplication
 * @date 2020/3/16 4:43 下午
 * @E-mail:695234456@qq.com
 * @Copyright: 版权所有 (C) 2020 civism
 * @return eureka Client 与 Eureka Server配合，可实现服务注册与发现。
 * 通过 EnableDiscoveryClient注解 或 EnableEurekaClient注解，都可启用Eureka客户端用以注册与发现服务，
 * 区别在于：EnableEurekaClient仅可用于Eureka，而EnableDiscoveryClient却用于Eureka、Consul、Zookeeper等。
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
