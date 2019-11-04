package ai.guiji.dubbo.server;

import ai.guiji.dubbo.api.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * author: zhouliliang
 * Date: 2019/11/4 19:36
 * Description:
 */

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "hello " + name;
    }

}