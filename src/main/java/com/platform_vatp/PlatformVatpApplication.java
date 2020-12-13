package com.platform_vatp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan({"com.platform_vatp", "templates"})
public class PlatformVatpApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformVatpApplication.class, args);
    }

}
