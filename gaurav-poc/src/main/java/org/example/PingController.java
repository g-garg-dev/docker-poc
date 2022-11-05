package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/oms/v1")
public class PingController {

    @GetMapping("/ping")
    public String ping() {
        System.out.println("ping-v2 call came at "+new Date(System.currentTimeMillis()).toGMTString());
        return "ping check done " + new Date(System.currentTimeMillis()).toGMTString();
    }

    @GetMapping("/health")
    public String health() {
        return "health check done-v2";
    }
}
