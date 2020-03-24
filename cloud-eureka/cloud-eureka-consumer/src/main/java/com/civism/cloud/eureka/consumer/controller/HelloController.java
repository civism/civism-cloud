package com.civism.cloud.eureka.consumer.controller;

import com.civism.cloud.eureka.consumer.service.HomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : civism
 * @version 1.0
 * @projectName：civism-cloud
 * @className：HelloController
 * @date 2020/3/17 10:53 上午
 * @E-mail:695234456@qq.com
 * @Copyright: 版权所有 (C) 2020 civism
 * @return
 */
@RestController
public class HelloController {

    @Resource
    private HomeService homeService;

    @GetMapping("/hello")
    public Object hello() {
        return homeService.sayHello();
    }
}
