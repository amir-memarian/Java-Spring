package aop.aspectJAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static java.lang.System.out;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aOPContext.xml");
        AOPOperation aopOperation = (AOPOperation) context.getBean("aopBean");

        out.println("calling method01...");
        aopOperation.method01();
        out.println("calling method02...");
        aopOperation.method02();
        out.println("calling method03...");
        aopOperation.method03();
    }
}
