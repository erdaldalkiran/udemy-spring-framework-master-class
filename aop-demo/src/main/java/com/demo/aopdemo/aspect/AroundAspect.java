package com.demo.aopdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around(value = "com.demo.aopdemo.aspect.CommonPointCutConfig.aopdemo()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        var start = System.currentTimeMillis();
        try {
            jp.proceed();
        } catch (Throwable ex) {
            throw ex;
        } finally {
            var end = System.currentTimeMillis();
            var elapsed = end - start;
            logger.info("around: {}ms elapsed for {}.", elapsed, jp);
        }
    }
}
