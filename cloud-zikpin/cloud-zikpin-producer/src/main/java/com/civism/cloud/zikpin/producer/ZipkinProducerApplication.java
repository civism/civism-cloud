package com.civism.cloud.zikpin.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : civism
 * @version 1.0
 * @projectName：civism-cloud
 * @className：ZipkinProducerApplication
 * @date 2020/3/23 5:25 下午
 * @E-mail:695234456@qq.com
 * @Copyright: 版权所有 (C) 2020 civism
 * @return
 */
@SpringBootApplication
@ServletComponentScan
@EnableDiscoveryClient
@EnableFeignClients
public class ZipkinProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinProducerApplication.class, args);
    }
}
