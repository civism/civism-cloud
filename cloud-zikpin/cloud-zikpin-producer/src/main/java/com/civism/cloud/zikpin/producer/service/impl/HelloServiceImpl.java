package com.civism.cloud.zikpin.producer.service.impl;

import com.civism.cloud.zikpin.producer.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author : civism
 * @version 1.0
 * @projectName：civism-cloud
 * @className：HelloServiceImpl
 * @date 2020/3/23 7:06 下午
 * @E-mail:695234456@qq.com
 * @Copyright: 版权所有 (C) 2020 civism
 * @return
 */
@Service
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello(String name) {
        return "zipkin, hello " + name;
    }
}
