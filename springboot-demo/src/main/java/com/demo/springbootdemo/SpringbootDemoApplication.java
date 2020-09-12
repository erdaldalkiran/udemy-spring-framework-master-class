package com.demo.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        var applicationContext = SpringApplication.run(SpringbootDemoApplication.class, args);

        for (var beanName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }

}
