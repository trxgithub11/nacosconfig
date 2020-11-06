package com.trx.consumer.nacosconfigconsumer;

import com.trx.nacosconfig.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference
    EchoService echoService;
    @GetMapping("/call")
    public String call(){

        return echoService.echo("Mic");
    }
}
