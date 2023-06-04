package autowiring;

import static java.lang.System.out;

public class ClassA {
    private ClassB classB;
    ClassA(){
        out.println("a is created");
    }
    public ClassB getClassB() {
        return classB;
    }
    public void setClassB(ClassB classB) {
        this.classB = classB;
    }
    public void print(){
        out.println("hello a");
    }
    public void display(){
        print();
        classB.print();
    }
}

