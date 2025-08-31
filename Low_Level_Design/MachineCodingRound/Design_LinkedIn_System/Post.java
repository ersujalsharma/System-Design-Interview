package Low_Level_Design.MachineCodingRound.Design_LinkedIn_System;

import java.util.List;

public class Post {
    String des;
    User postedBy;
    List<Comment> comments;
    Reactions reactions;
    @Override
    public String toString() {
        return "Post [des=" + des + ", postedBy=" + postedBy + ", comments=" + comments + ", reactions=" + reactions
                + "]";
    }
}
