package factory;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryShould {

    @Test
    void factory01() {
        ApplicationContext context=new ClassPathXmlApplicationContext("factoryContext.xml");

        ClassFactoryA classFactoryA=(ClassFactoryA) context.getBean("classFactoryABean01");

        classFactoryA.msg();
    }

    @Test
    void factory02() {
        ApplicationContext context=new ClassPathXmlApplicationContext("factoryContext.xml");

        Printable printable=(Printable)context.getBean("printableFactoryBean01");

        printable.print();
    }

    @Test
    void factory03() {
        ApplicationContext context=new ClassPathXmlApplicationContext("factoryContext.xml");

        Printable printable=(Printable)context.getBean("printableFactoryBean02");

        printable.print();
    }
}
