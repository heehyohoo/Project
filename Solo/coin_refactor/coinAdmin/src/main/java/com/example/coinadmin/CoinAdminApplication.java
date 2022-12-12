package com.example.coinadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.example.coinadmin.mapper"})
public class CoinAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoinAdminApplication.class, args);
    }

}
