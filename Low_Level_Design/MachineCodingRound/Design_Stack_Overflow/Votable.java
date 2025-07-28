package Low_Level_Design.MachineCodingRound.Design_Stack_Overflow;

import java.util.Map;

public abstract class Votable {
    public Map<User,Integer> votedUser;
    public int voteCount;
    public void upVote(User user) {
        if(votedUser.containsKey(user)) {
            if(votedUser.get(user)==0){
                System.out.println("Already Voted....");
                return;
            }
            else{
                votedUser.put(user, 1);
                this.voteCount+=2;
            }
        }
        else{
            votedUser.put(user,0);
            voteCount++;
        }
    }
    public void downVote(User user) {
        if(votedUser.containsKey(user)) {
            if(votedUser.get(user)==1){
                System.out.println("Already Voted....");
                return;
            }
            else{
                votedUser.put(user, 0);
                this.voteCount-=2;
            }
        }
        else{
            votedUser.put(user,1);
            voteCount--;
        }
    }
}
