package com.yjxxt.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(value = "com.yjxxt.controller")
public class WebConfig {


    //试图解析器
    @Bean
    public InternalResourceViewResolver viewResolver(){

        InternalResourceViewResolver irvr = new InternalResourceViewResolver();
        //前缀
        irvr.setPrefix("/");
        //后缀
        irvr.setSuffix(".jsp");

        return irvr;
    }
}
