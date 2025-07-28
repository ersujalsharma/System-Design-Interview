package Low_Level_Design.MachineCodingRound.Design_Stack_Overflow;

public class User {
    int counter = 0;
    private int userId;
    private String username;
    public User(String username){
        this.userId = counter++;
        this.username = username;
    }
    @Override
    public String toString() {
        return "User [counter=" + counter + ", userId=" + userId + ", username=" + username + "]";
    }
    
}
