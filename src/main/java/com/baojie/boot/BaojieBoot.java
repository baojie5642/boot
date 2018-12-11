package com.baojie.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.baojie.boot")
public class BaojieBoot {

    public static void main(String[] args) {
        SpringApplication.run(BaojieBoot.class, args);
    }
}
