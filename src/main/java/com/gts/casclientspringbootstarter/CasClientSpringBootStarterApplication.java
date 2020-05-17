package com.gts.casclientspringbootstarter;

import com.gts.annotation.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com.gts")
@EnableCasClient//开启cas
public class CasClientSpringBootStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasClientSpringBootStarterApplication.class, args);
    }

}
