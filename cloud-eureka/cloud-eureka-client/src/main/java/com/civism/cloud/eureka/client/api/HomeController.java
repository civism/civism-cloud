package com.civism.cloud.eureka.client.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : civism
 * @version 1.0
 * @projectName：civism-cloud
 * @className：IndexController
 * @date 2020/3/16 4:28 下午
 * @E-mail:695234456@qq.com
 * @Copyright: 版权所有 (C) 2020 civism
 * @return
 */
@RestController
public class HomeController {

    @GetMapping("/home")
    public Object index() {
        return "hello world";
    }
}
