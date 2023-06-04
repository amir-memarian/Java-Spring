package aop.aspectJAnnotation;

import org.aspectj.lang.JoinPoint;

public class AOPXMLTrackOperation {
    public void myAdvice(JoinPoint jp)//it is advice
    {
        System.out.println("additional concern");
        System.out.println("Method Signature: "  + jp.getSignature());
    }
}
