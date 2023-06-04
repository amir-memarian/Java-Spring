package aop.old;

import autowiring.ClassA;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPShould {
    @Test
    void name() {
        ApplicationContext context=new ClassPathXmlApplicationContext("aOPProxyFactoryContext.xml");
        AOPClassA aopClassA =context.getBean("proxy", AOPClassA.class);
        aopClassA.printMessage();
        System.out.println("----------------------------------------");
        try{
            aopClassA.validate(12);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
