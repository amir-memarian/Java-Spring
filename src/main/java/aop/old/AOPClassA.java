package aop.old;

public class AOPClassA {
    public void printMessage(){
        System.out.println("actual business logic");
    }

    public void validate(int age)throws Exception{
        if(age<18){
            throw new ArithmeticException("Not Valid Age");
        }
        else{
            System.out.println("vote confirmed");
        }
    }

}
