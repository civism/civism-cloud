package com.civism.cloud.zikpin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @author : civism
 * @version 1.0
 * @projectName：civism-cloud
 * @className：ZikpinServerApplication
 * @date 2020/3/23 11:35 上午
 * @E-mail:695234456@qq.com
 * @Copyright: 版权所有 (C) 2020 civism
 * @return
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication.class, args);
    }
}
