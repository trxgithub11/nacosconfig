package com.trx.nacos.dubbo.provider.nacosprovider.dubbo.demo.provider;

import com.trx.nacosconfig.api.EchoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;


@RefreshScope
@Service(protocol = "dubbo")
public class EchoServiceImpl implements EchoService {

    @Value("${project.name}")
    private String name;

    @Override
    public String echo(String message) {
        return "["+name+"] Hello,"+message;
    }
}
