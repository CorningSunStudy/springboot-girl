package com.girl.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by corning on 2017/4/20.
 */
@Aspect
@Component
public class HttpAspect {
    
    private static final Logger logger = LoggerFactory.getLogger(HttpAspect.class);
    
    @Pointcut(value = "execution(public * com.girl.controller.GirlController.*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore() {
        logger.info("log HttpAspect Before log !!!!!!");
    }

    @After("log()")
    public void doAfter() {
        logger.info("log HttpAspect After log !!!!!!");
    }

}
