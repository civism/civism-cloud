package com.civism.cloud.zikpin.producer.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : civism
 * @version 1.0
 * @projectName：civism-cloud
 * @className：HomeService
 * @date 2020/3/17 10:54 上午
 * @E-mail:695234456@qq.com
 * @Copyright: 版权所有 (C) 2020 civism
 * @return
 */
@FeignClient(name = "civism-cloud-client")
public interface HomeRpcService {

    /**
     * hello world
     * @return
     */
    @GetMapping("/home")
    String sayHello();
}
