package com.demo.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(pointcut = "com.demo.aopdemo.aspect.CommonPointCutConfig.business()", returning = "result")
    public void afterReturning(JoinPoint jp, Object result){
        logger.info("after returning: intercepted method call: {}, return: {}", jp, result);
    }

    @AfterThrowing(pointcut = "com.demo.aopdemo.aspect.CommonPointCutConfig.business()", throwing = "exception")
    public void afterThrowing(JoinPoint jp, Throwable exception){
        logger.info("after throwing: intercepted method call: {}, exception: {}", jp, exception.getMessage());
    }

    @After(value = "com.demo.aopdemo.aspect.CommonPointCutConfig.business()")
    public void after(JoinPoint jp){
        logger.info("after: intercepted method call: {}", jp);
    }
}
