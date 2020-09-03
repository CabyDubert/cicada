package com.dubo.consumer.controller;

import com.dubo.consumer.service.ProviderApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private ProviderApiService providerApi;

    @GetMapping("/getRole")
    public String getRole() {
        return providerApi.getRole();
    }

    @GetMapping("/getUser")
    public String getUser() {
        return providerApi.getUser();
    }

    @GetMapping("/echo/{string}")
    public String echo(@PathVariable String string) {
        return providerApi.echo(string);
    }

//    @SentinelResource(value = "ribbonHi", fallback = "ribbonHiFallback")
//    @GetMapping("/testSentinel")
//    public String testSentinel(){
//        return "";
//    }

//        @SentinelResource(value = "ribbonHi", fallback = "ribbonHiFallback")
//    @RequestMapping(value = "/ribbon/hi", method = {RequestMethod.GET, RequestMethod.POST})
//    public String ribbonHi(String name) {
//        return "服务消费者 ribbon 发起";
//    }

    /**
     * Ribbon服务熔断降级
     */
//    public String ribbonHiFallback(String name) {
//        return "Ribbon Hi: '" + name + "', fallback sentinel";
//    }

//    @GetMapping("/sentinel/block")
//    @SentinelResource(value = "sentinelBlock", blockHandler = "sentinelBlockHandler", blockHandlerClass = BlockHandler.class)
//    public String sentinelBlock() {
//        return "This is sentinel control service flow";
//    }
//
//    @GetMapping("/sentinel/fallback")
//    @SentinelResource(value = "sentinelFallback", fallback = "sentinelFallback", fallbackClass = FallbackHandler.class)
//    public String sentinelFallback() {
//        throw new RuntimeException("This is sentinel control service fallback");
//        //return Result.failure(500, "This is sentinel control service fallback");
//    }
}
