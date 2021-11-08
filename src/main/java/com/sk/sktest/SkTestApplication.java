package com.sk.sktest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.sk.sktest.mapper")
@EnableTransactionManagement
public class SkTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkTestApplication.class, args);
    }

}
