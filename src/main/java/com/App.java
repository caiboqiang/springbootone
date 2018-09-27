package com;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描mapper接口
@MapperScan(basePackages = {"com.mapper"})
//扫描注解
//@ComponentScan(basePackages = {"com.*"})
@Slf4j
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        System.out.println("====={启动}======");
        //log.info("=================");
    }


}
