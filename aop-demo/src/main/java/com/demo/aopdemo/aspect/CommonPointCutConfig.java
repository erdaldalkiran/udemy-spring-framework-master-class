package com.demo.aopdemo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfig {
    @Pointcut("execution(* com.demo.aopdemo.business.*.*(..))")
    public void business() {
    }

    @Pointcut("execution(* com.demo.aopdemo.data.*.*(..))")
    public void data() {
    }

    @Pointcut("execution(* com.demo.aopdemo..*.*(..))")
    public void aopdemo() {
    }

    @Pointcut("com.demo.aopdemo.aspect.CommonPointCutConfig.business() && com.demo.aopdemo.aspect.CommonPointCutConfig.data()")
    public void combined() {
    }

    @Pointcut("bean(Dao*)")
    public void beanRegex() {
    }

    @Pointcut("within(com.demo.aopdemo.business..*)")
    public void withInPackage() {
    }

    @Pointcut("@annotation(com.demo.aopdemo.aspect.TrackTime)")
    public void trackTime() {
    }
}
