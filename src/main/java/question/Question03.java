package question;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;
public class Question03 {
    private final int id;
    private final String name;
    private final Map<String,String> answers;
    public Question03(int id, String name, Map<String, String> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }
    public void displayInfo(){
        System.out.println("question id:"+id);
        System.out.println("question name:"+name);
        System.out.println("Answers....");
        Set<Entry<String, String>> set=answers.entrySet();
        Iterator<Entry<String, String>> itr = set.stream().iterator();
        while(itr.hasNext()){
            Entry<String,String> entry=itr.next();
            System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());
        }
    }
}
