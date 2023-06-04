package question;

import java.util.List;

public class Question02 {
    private final int id;
    private final String name;
    private final List<Answer> answers;
    public Question02(int id, String name, List<Answer> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }
    public void displayInfo(){
        System.out.println(id+" "+name);
        System.out.println("answers are:");
        for (Answer answer : answers) {
            System.out.println(answer);
        }
    }
}
