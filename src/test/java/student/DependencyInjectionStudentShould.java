package student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionStudentShould {
    private String beanName01;
    private String beanName02;
    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        beanName01 = "studentBean01";
        beanName02 = "studentBean02";
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    void dIByConstructor() {
        Student student = (Student) context.getBean(beanName02);
        student.show();
        student.displayInfo();
    }

    @Test
    void dIBySetter() {
        Student student = (Student) context.getBean(beanName01);
        student.show();
        student.displayInfo();
    }
    
    
}
