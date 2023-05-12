package com.net.drivingschoolmanagementsystem;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@RestController
public class DrivingSchoolManagementSystemApplication {

    @PostConstruct
    public void init(){
        // Setting Spring Boot SetTimeZone
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8:00"));
    }
    public static void main(String[] args) {
        SpringApplication.run(DrivingSchoolManagementSystemApplication.class, args);
        System.out.println(TimeZone.getDefault().getDisplayName());
    }

}
