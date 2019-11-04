package ai.guiji.dubbo.client.controller;

import ai.guiji.dubbo.api.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: zhouliliang
 * Date: 2019/11/4 19:48
 * Description:
 */
@Slf4j
@RestController
public class TestController {

    @Reference
    HelloService helloService;

    @GetMapping("/test")
    public String test() {
        return helloService.hello("ai.guiji");
    }
}
