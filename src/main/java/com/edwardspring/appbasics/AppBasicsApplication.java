package com.edwardspring.appbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class AppBasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppBasicsApplication.class, args);
    }
}
