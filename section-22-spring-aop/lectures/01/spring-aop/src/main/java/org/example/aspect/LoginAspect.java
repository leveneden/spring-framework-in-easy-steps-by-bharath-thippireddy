package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoginAspect {

    @Before("execution(public int org.example.service.SimpleMultiplyService.multiply(int, int))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before the method invocation");
    }

    @After("execution(public int org.example.service.SimpleMultiplyService.multiply(int, int))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After the method invocation");
    }
}
