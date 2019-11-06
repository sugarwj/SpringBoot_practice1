package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication   //开启SpringBoot应用
@MapperScan("com.baizhi.dao")     //必须在入口类中加入这个配置
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        //启动SpringBoot应用
        SpringApplication.run(Application.class,args);
    }

    //告知外部的Tomcat 加载该入口类
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

}
