package Low_Level_Design.MachineCodingRound.Design_Task_Management_System;

public class Comment {
    static int counter = 0;
    private int commentId;
    private User user;
    private String commentDesc;
    public int getCommentId() {
        return commentId;
    }
    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }
    public String getCommentDesc() {
        return commentDesc;
    }
    public void setCommentDesc(String commentDesc) {
        this.commentDesc = commentDesc;
    }
    public Comment(String commentDesc,User user) {
        this.commentId = counter++;
        this.commentDesc = commentDesc;
        this.user = user;
    }
    @Override
    public String toString() {
        return "Comment [commentId=" + commentId + ", user=" + user + ", commentDesc=" + commentDesc + "]";
    }
    
}
