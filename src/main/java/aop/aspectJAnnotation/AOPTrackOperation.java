package aop.aspectJAnnotation;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class AOPTrackOperation {
    @Pointcut("execution(* Operation.*(..))")
    public void Method03() {
    }//pointcut name

    @Before("Method03()")//applying pointcut on before advice
    public void myAdvice(JoinPoint jp)//it is advice (before advice)
    {
        System.out.println("additional concern");
        //System.out.println("Method Signature: "  + jp.getSignature());
    }
}
