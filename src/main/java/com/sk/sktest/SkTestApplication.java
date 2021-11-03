package com.sk.sktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class SkTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkTestApplication.class, args);
    }

}
