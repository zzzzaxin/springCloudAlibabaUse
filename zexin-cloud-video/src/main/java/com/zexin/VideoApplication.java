package com.zexin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.zexin.dao")
public class VideoApplication {

    public static void main(String[] args){
        SpringApplication.run(VideoApplication.class,args);
    }
}
