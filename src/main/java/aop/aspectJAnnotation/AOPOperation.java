package aop.aspectJAnnotation;

public class AOPOperation {
    public void method01(){
        System.out.println("method01 method invoked");
    }
    public int method02(){
        System.out.println("method02 method invoked");
        return 2;
    }
    public int method03(){
        System.out.println("method03 method invoked");
        return 3;
    }
}
