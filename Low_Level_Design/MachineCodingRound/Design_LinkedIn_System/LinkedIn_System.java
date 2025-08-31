package Low_Level_Design.MachineCodingRound.Design_LinkedIn_System;

import java.util.List;

public class LinkedIn_System {
    FeedService feedService;
    AuthorizationService authorizationService;
    User visitedUser;
    
    public LinkedIn_System(FeedService feedService, AuthorizationService authorizationService, User visitedUser) {
        this.feedService = feedService;
        this.authorizationService = authorizationService;
        this.visitedUser = visitedUser;
    }
    void login(Form1 form){
        User user = authorizationService.login(form);
        visitedUser = user;
    }
    User register(Form1 form){
        User user = authorizationService.register(form);
        return user;
    }
    void showFeed(){
        List<Post> list = feedService.recommendedPost;
        System.out.println(list);
    }
    Post createPost(PostForm postForm){
        if(visitedUser == null) {
            System.out.println("First Login...");
            return null;
        }
        Post post = feedService.createPost(visitedUser, postForm);
        feedService.recommendedPost.add(post);
        return post;
    }
    void logout(){
        visitedUser = null;
    }
}
