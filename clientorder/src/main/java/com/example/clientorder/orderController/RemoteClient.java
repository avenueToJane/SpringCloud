package com.example.clientorder.orderController;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: yangsheng
 * @Description:
 * @Date: Created in 下午 03:05 2018-12-13
 */
@FeignClient("SERVICE-USER")
public interface RemoteClient {
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    String test();
}
