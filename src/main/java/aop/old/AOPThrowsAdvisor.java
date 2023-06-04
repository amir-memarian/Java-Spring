package aop.old;

import org.springframework.aop.ThrowsAdvice;

public class AOPThrowsAdvisor implements ThrowsAdvice {
    public void afterThrowing(Exception ex){
        System.out.println("Throws-->> additional concern if exception occurs");
    }
}
