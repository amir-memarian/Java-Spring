package factory;

public class PrintableFactory02 {
    public Printable getPrintable(){
        //return new ClassFactoryB02();
        return new ClassFactoryB01(); //return any one instance, either ClassFactoryB01 or ClassFactoryB02
    }
}
