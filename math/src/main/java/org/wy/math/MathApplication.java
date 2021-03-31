package org.wy.math;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class MathApplication {

    public static void main(String[] args) {
        SpringApplication.run(MathApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/add")
    public String add(@RequestParam(value = "num1", defaultValue = "0") int num1, @RequestParam(value = "num2", defaultValue = "0") int num2) {
        int sum = num1 + num2;
        return "sum is " + sum + "from port:" + port;
    }

}