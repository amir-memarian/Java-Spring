package student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentShould {

    private String beanName;
    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        beanName = "studentBean01";
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    void createApplicationContentAndCheckStudentBean() {
        Student student = (Student) context.getBean(beanName);

        student.displayInfo();
        assertTrue(context.isSingleton(beanName));
        assertTrue(context.getBean(beanName) instanceof Student);
        assertTrue(context.isTypeMatch(beanName, Student.class));
    }

    @Test
    void createBeanFactoryAndCheckStudentBean() {

        BeanFactory factory = context;
        Student myBean = (Student)factory.getBean(beanName);

        myBean.displayInfo();
        assertTrue(context.isSingleton(beanName));
        assertTrue(context.getBean(beanName) instanceof Student);
        assertTrue(context.isTypeMatch(beanName, Student.class));
        /*
        // add pom.xml
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-beans</artifactId>
            <version>5.2.8.RELEASE</version>
        </dependency>

        Resource res = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(res);

        Student student = (Student) factory.getBean(beanName);

        assertTrue(factory.isSingleton(beanName));
        assertTrue(factory.getBean(beanName) instanceof Student);
        assertTrue(factory.isTypeMatch(beanName, Student.class));
        */
    }
}
