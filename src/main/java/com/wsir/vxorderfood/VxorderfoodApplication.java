package com.wsir.vxorderfood;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.wsir.vxorderfood.mapper")
public class VxorderfoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(VxorderfoodApplication.class, args);
    }

}
