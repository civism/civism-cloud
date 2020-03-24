package com.civism.cloud.zikpin.producer.controller;

import com.civism.cloud.zikpin.producer.rpc.HomeRpcService;
import com.civism.cloud.zikpin.producer.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : civism
 * @version 1.0
 * @projectName：civism-cloud
 * @className：HelloController
 * @date 2020/3/23 7:03 下午
 * @E-mail:695234456@qq.com
 * @Copyright: 版权所有 (C) 2020 civism
 * @return
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @Resource
    private HomeRpcService homeRpcService;


    @GetMapping("/zipkin/hello")
    public Object hello() {
        return helloService.sayHello("civism");
    }

    @GetMapping("/zipkin/home")
    public Object home() {
        return homeRpcService.sayHello();
    }
}
