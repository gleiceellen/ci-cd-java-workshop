package com.testService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = { TestController.class })
@EnableAutoConfiguration
public class TestServiceApplication {


     /**
     *
     * @param args s
     */
     public static void main(String[] args) {
        SpringApplication.run(TestServiceApplication.class, args);
        System.exit(0);
     }

}
