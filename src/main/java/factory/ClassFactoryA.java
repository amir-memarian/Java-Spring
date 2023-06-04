package factory;

public class ClassFactoryA {
    private static final ClassFactoryA obj = new ClassFactoryA();
    private ClassFactoryA() {
        System.out.println("private constructor");
    }
    public static ClassFactoryA getClassFactoryA() {
        System.out.println("factory method ");
        return obj;
    }
    public void msg() {
        System.out.println("hello user");
    }
}
