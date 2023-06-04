package aop.aspectJAnnotation;

import static java.lang.System.out;

public class AOPOperation {
    public void method01(){
        out.println("method01 method invoked");
    }
    public int method02(){
        out.println("method02 method invoked");
        return 2;
    }
    public int method03(){
        out.println("method03 method invoked");
        return 3;
    }
}
