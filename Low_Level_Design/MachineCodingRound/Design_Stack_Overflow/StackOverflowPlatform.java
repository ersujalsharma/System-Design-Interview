package Low_Level_Design.MachineCodingRound.Design_Stack_Overflow;

import java.util.ArrayList;
import java.util.List;

public class StackOverflowPlatform {
    private List<Question> list;
    private User user;
    public StackOverflowPlatform(){

    }
    public StackOverflowPlatform(List<Question> list){
        this.list = new ArrayList<>(list);
    }
    public void login(User user){
        this.user = user;
    }
    public void logout(){
        this.user = null;
    }
    public void printList(){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public void addQuestion(Question question){
        if(user != null){
            list.add(question);
        }
        else{
            System.out.println("First Login....");
        }
    }
}
