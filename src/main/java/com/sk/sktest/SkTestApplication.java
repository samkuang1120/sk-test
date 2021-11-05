package com.sk.sktest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
@MapperScan("com.sk.sktest.mapper")
public class SkTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkTestApplication.class, args);
    }

}
