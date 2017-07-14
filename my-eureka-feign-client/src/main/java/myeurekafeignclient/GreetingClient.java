package myeurekafeignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author @abogaichuk
 */
@FeignClient("my-eureka-client")
public interface GreetingClient {

    @RequestMapping("/greeting")
    String greeting();
}
