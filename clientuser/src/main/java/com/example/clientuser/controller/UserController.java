package com.example.clientuser.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yangsheng
 * @Description:
 * @Date: Created in 上午 10:34 2018-12-13
 */
@RestController
public class UserController {
    @Autowired
    private EurekaClient client;
    @RequestMapping("/test")
    public String testClient() {
        InstanceInfo instanceInfo = client.getNextServerFromEureka("SERVICE-USER", false);
        return instanceInfo.getHomePageUrl();//获取服务的URL
    }

    @RequestMapping("/info")
    public String testInfo() {
        return "hello";
    }
}
