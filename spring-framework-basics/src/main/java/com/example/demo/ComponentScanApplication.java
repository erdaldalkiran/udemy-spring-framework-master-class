package com.example.demo;

import com.example.componentscan.ComponentDOA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(basePackageClasses = ComponentDOA.class)
public class ComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);

    public static void main(String[] args) {

        var context = SpringApplication.run(ComponentScanApplication.class, args);
        System.out.println();
        System.out.println();
        System.out.println();

        var componentDOA = context.getBean(ComponentDOA.class);
        var componentDOA1 = context.getBean(ComponentDOA.class);

        LOGGER.info("{}", componentDOA);
        LOGGER.info("{}", componentDOA.getComponentConnection());
        LOGGER.info("{}", componentDOA.getComponentConnection());

        LOGGER.info("{}", componentDOA1);
        LOGGER.info("{}", componentDOA1.getComponentConnection());

        LOGGER.info("scope");
    }

}
