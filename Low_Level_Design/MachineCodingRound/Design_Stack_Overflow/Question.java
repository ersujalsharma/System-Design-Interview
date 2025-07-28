package Low_Level_Design.MachineCodingRound.Design_Stack_Overflow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Question extends Votable{
    private static int counter = 0;
    private int questionId;
    private String title;
    private String description;
    private List<Answer> answers;
    private List<Comment> comments;
    private User createdByUser;
    public Question(String title,String des,User user){
        this.questionId = counter++;
        this.description = des;
        this.createdByUser = user; 
        this.votedUser = new HashMap<>();   
        this.voteCount = 0;   
    }
    public void addAnswers(Answer answer){
        if(answers == null) answers = new ArrayList<>();
        answers.add(answer);
    }
    @Override
    public String toString() {
        return "Question [counter=" + counter + ", questionId=" + questionId + ", title=" + title + ", description="
                + description + ", answers=" + answers + ", comments=" + comments + ", voteCount=" + voteCount
                + ", createdByUser=" + createdByUser + "]";
    }
    public void printAnswers(){
        for(int i=0;i<answers.size();i++){
            System.out.println(answers.get(i));
        }
    }
}
