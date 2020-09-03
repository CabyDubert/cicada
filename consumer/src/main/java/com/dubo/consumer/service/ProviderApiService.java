package com.dubo.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "provider")
public interface ProviderApiService {
    @GetMapping("/echo/{str}")
    String echo(@PathVariable("str") String str);

    @GetMapping("/getUser")
    String getUser();

    @GetMapping("/role/getRole")
    String getRole();

}
