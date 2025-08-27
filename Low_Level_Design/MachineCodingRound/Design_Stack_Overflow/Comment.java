package Low_Level_Design.MachineCodingRound.Design_Stack_Overflow;

public class Comment {
    private static int counter = 0;
    private int commentId;
    private String message;
    public Comment(String message){
        this.commentId = counter++;
        this.message = message;
    } 
    
}
