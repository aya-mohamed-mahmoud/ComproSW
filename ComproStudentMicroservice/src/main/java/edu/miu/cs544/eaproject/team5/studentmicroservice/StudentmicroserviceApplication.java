package edu.miu.cs544.eaproject.team5.studentmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class StudentmicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentmicroserviceApplication.class, args);
    }

}
