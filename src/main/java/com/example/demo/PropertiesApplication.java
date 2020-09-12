package com.example.demo;

import com.example.demo.properties.SomeService;
import com.example.demo.scope.PersonDOA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class PropertiesApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(PropertiesApplication.class);

    public static void main(String[] args) {

        var context = SpringApplication.run(PropertiesApplication.class, args);
        System.out.println();
        System.out.println();
        System.out.println();

        var service = context.getBean(SomeService.class);

        LOGGER.info("{}", service);
        LOGGER.info("{}", service.getUrl());

        LOGGER.info("properties");
    }

}
