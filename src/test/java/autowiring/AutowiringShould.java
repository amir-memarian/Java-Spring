package autowiring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringShould {
    @Test
    void autowiring_in_Spring() {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassA classA =context.getBean("classA", ClassA.class);
        classA.display();
    }


}
