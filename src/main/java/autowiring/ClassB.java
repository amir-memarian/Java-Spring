package autowiring;

import static java.lang.System.out;

public class ClassB {
    ClassB(){
        out.println("classB is created");
    }
    public void print(){
        out.println("hello classB");
    }
}
