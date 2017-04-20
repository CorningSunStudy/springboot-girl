package com.girl.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

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
    public void doBefore(JoinPoint joinPoint ) {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();

        logger.info("method={}, url={}, ip={}", request.getMethod(), request.getRequestURL(), request.getRemoteAddr());
        logger.info("class_method={}, args={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName(), joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter() {
        logger.info("log HttpAspect After log !!!!!!");
    }

    @AfterReturning(value = "log()", returning = "object")
    public void doAfterReturning(Object object) {
        logger.info("response={}", object);
    }

}
