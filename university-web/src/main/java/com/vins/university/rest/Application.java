package com.vins.university.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by kisa on 8/17/2016.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@ImportResource({"classpath*:university-rest-api-servlet.xml"})
public class Application
{
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        SecurityFilter securityFilter = new SecurityFilter();
//        registrationBean.setFilter(securityFilter);
//        registrationBean.addUrlPatterns("/api/*");
//
//        return registrationBean;
//    }
}
