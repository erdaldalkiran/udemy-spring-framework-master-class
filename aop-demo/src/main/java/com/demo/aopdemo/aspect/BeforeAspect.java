package com.demo.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("com.demo.aopdemo.aspect.CommonPointCutConfig.business()")
    public void before(JoinPoint jp){
        logger.info("before: intercepted method call: {}, arguments: {}", jp, jp.getArgs());
    }
}
