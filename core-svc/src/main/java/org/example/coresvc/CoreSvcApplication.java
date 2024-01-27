package org.example.coresvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients
@EnableScheduling
public class CoreSvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreSvcApplication.class, args);
    }
}
