package com.example.demo;

import com.example.demo.scope.PersonDOA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);

    public static void main(String[] args) {

        var context = SpringApplication.run(ScopeApplication.class, args);
        System.out.println();
        System.out.println();
        System.out.println();

        var personDOA = context.getBean(PersonDOA.class);
        var personDOA2 = context.getBean(PersonDOA.class);

        LOGGER.info("{}", personDOA);
        LOGGER.info("{}", personDOA.getJdbcConnection());
        LOGGER.info("{}", personDOA.getJdbcConnection());

        LOGGER.info("{}", personDOA2);
        LOGGER.info("{}", personDOA2.getJdbcConnection());

        LOGGER.info("scope");
    }

}
