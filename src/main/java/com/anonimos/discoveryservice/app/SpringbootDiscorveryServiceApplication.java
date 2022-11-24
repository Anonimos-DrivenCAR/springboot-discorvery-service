package com.anonimos.discoveryservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootDiscorveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDiscorveryServiceApplication.class, args);
    }

}
