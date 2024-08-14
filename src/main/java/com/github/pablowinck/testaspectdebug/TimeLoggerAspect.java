package com.github.pablowinck.testaspectdebug;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeLoggerAspect {

    private static final Logger log = LoggerFactory.getLogger(TimeLoggerAspect.class);

    @Around("@annotation(TimeLogger)")
    public Object methodTimeLogger(ProceedingJoinPoint joinPoint)
            throws Throwable {
        long startTime = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();

        long totalTime = System.currentTimeMillis() - startTime;
        log.info("Method {}: {}ms", joinPoint.getSignature(), totalTime);

        return proceed;
    }
}
