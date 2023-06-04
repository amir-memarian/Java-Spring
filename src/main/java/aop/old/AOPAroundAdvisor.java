package aop.old;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AOPAroundAdvisor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object obj;
        System.out.println("Around-->> additional concern before actual logic");
        obj=invocation.proceed();
        System.out.println("Around-->> additional concern after actual logic");
        return obj;      }
}
