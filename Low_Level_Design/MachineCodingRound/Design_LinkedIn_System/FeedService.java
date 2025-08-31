package Low_Level_Design.MachineCodingRound.Design_LinkedIn_System;

import java.util.ArrayList;
import java.util.List;

public class FeedService {
    List<Post> recommendedPost;
    Profile profile;
    public FeedService(){
        recommendedPost = new ArrayList<>();
    }
    Post createPost(User user,PostForm post){
        Post post2 = new Post();
        post2.des = post.des;
        post2.postedBy = user;
        post2.comments = new ArrayList<>();
        post2.reactions = new Reactions();
        return post2;
    }
    List<Post> showFeed(){
        return recommendedPost;
    }
}
