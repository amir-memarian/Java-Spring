package aop.old;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class AOPBeforeAdvisor implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Before-->> additional concern before actual logic");
    }
}
