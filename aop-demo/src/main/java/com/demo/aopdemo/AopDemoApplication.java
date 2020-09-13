package com.demo.aopdemo;

import com.demo.aopdemo.business.Business1;
import com.demo.aopdemo.business.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private Business1 business1;
    private Business2 business2;

    public static void main(String[] args) {
        SpringApplication.run(AopDemoApplication.class, args);
    }

    public AopDemoApplication(Business1 business1, Business2 business2) {
        this.business1 = business1;
        this.business2 = business2;
    }

    @Override
    public void run(String... args)  {
        logger.info(business1.calculateSomething("ciko"));
        try {
            logger.info(business2.calculateSomething());
        }
        catch (Exception ex){
            logger.error("exception logged: {}", ex.toString());
        }
    }
}
