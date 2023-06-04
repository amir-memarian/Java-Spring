package student;

public class Student {
    private String name;
    private Integer id;

    public Student() {System.out.println("Default Constructor");}
    public Student(int id) {this.id = id;}
    public Student(String name) {  this.name = name;}
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void displayInfo() {
        System.out.println("Hello: "+name);
    }
    public void show(){
        System.out.println(id+" "+name);
    }
}

