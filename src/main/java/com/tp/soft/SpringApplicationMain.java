package com.tp.soft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.tp.soft.mapper")
public class SpringApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationMain.class, args);
    }
}
