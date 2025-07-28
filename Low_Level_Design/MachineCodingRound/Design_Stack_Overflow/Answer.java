package Low_Level_Design.MachineCodingRound.Design_Stack_Overflow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Answer extends Votable{
    private static int counter = 0;
    private int answerId;
    private String title;
    private String description;
    private List<Comment> comments;
    private boolean approved;
    private User user;
    public Answer(String title,String des,User user){
        this.answerId = counter++;
        this.title = title;
        this.description = des;
        this.user = user;
        this.votedUser = new HashMap<>();
        this.voteCount = 0;
    }
    public void addComments(Comment comment){
        if(comments == null) comments = new ArrayList<>();
        comments.add(comment);
    }
    public List<Comment> viewComments(){
        return comments;
    }
    public void approvedAnswer(){
        this.approved = true;
    }
    @Override
    public String toString() {
        return "Answer [voteCount=" + voteCount + ", answerId=" + answerId + ", title=" + title + ", description="
                + description + ", comments=" + comments + ", approved=" + approved + ", user=" + user + "]";
    }
    
}
