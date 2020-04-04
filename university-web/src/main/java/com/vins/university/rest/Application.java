package com.vins.university.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by kisa on 8/17/2016.
 */
//@Configuration
//@ComponentScan
////@EnableAutoConfiguration
//@ImportResource({"classpath*:university-rest-api-servlet.xml.OLD"})
@SpringBootApplication(scanBasePackages = {
        "com.vins.university.rest",
        "com.vins.university.service",
        "com.vins.university.repository"})
@EnableJpaRepositories("com.vins.university.repository.api")
@EntityScan("com.vins.university.model")
//@EnableTransactionManagement
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
