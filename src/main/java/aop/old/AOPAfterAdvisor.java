package aop.old;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AOPAfterAdvisor implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("After-->> additional concern after returning advice");
    }
}
