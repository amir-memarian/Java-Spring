package employee;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependentObjectShould {
    @Test
    void constructorInjection() {
        String beanName = "employeeBean01";
        ApplicationContext context = new ClassPathXmlApplicationContext("employeeContextConstructor.xml");

        Employee employee = context.getBean(beanName,Employee.class);

        employee.show();
    }
    @Test
    void setterInjection() {
        String beanName = "employeeBean01";
        ApplicationContext context = new ClassPathXmlApplicationContext("employeeContextSetter.xml");

        Employee employee = context.getBean(beanName,Employee.class);

        employee.show();
    }
}
