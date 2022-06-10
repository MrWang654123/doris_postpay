package com.gtxy.yyf.doris;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.gtxy.yyf.doris.mapper")
@SpringBootApplication
public class DorisPostpayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DorisPostpayApplication.class, args);
    }

}
