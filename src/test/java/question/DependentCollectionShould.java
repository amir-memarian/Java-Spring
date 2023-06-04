package question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependentCollectionShould {
    private ApplicationContext context;
    @BeforeEach
    void setUp() {
        context = new ClassPathXmlApplicationContext("questionContextConstructor.xml");
    }

    @Test
    void constructor_Injection_Question01() {
        Question01 question01 = (Question01) context.getBean("questionBean01");
        question01.displayInfo();
    }

    @Test
    void constructor_Injection_Question02() {
        Question02 question02 = (Question02) context.getBean("questionBean02");
        question02.displayInfo();
    }

    @Test
    void constructor_Injection_Question03() {
        Question03 question03 = (Question03) context.getBean("questionBean03");
        question03.displayInfo();
    }

}
