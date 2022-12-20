package com.example.coffeeprince;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.example.coffeeprince.mapper"})
public class CoffeeprinceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoffeeprinceApplication.class, args);
    }

}
