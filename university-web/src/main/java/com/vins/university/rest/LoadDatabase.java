package com.vins.university.rest;

import com.vins.university.repository.api.DeptRepository;
import com.vins.university.service.impl.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase
{
    final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

//    @Bean
//    CommandLineRunner initDatabase(DeptRepository deptRepository)
//    {
////        return args -> {
////            deptRepository.save(new Employee("Bilbo Baggins", "burglar")));
////            deptRepository.save(new Employee("Frodo Baggins", "thief")));
////        };
//        return null;
//    }
}
