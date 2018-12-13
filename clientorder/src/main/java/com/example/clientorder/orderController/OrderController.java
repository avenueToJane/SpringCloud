package com.example.clientorder.orderController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: yangsheng
 * @Description:
 * @Date: Created in 上午 11:01 2018-12-13
 */
@RestController
public class OrderController {
    @Autowired
    private EurekaClient client;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RemoteClient remoteClient;

    @RequestMapping("/test")
    public String testClient() {
        InstanceInfo instanceInfo = client.getNextServerFromEureka("SERVICE-USER", false);
        return instanceInfo.getHomePageUrl();
    }
    @RequestMapping("/restTemplate")
    public String test() {
        return restTemplate.getForEntity("http://SERVICE-USER/test", String.class).getBody();
    }

    @RequestMapping("/feign")
    public String feign() {
        return remoteClient.test();
    }

}
