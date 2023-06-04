package question;

import java.util.List;

public class Question01 {
    private final int id;
    private final String name;
    private final List<String> answers;

    public Question01(int id, String name, List<String> answers) {
        super();
        this.id = id;
        this.name = name;
        this.answers = answers;
    }
    public void displayInfo(){
        System.out.println(id+" "+name);
        System.out.println("answers are:");
        for (String answer : answers) {
            System.out.println(answer);
        }
    }
}
