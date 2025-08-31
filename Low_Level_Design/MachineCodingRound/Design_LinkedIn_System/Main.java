package Low_Level_Design.MachineCodingRound.Design_LinkedIn_System;

public class Main {
    public static void main(String[] args) {
        LinkedIn_System linkedIn_System = new LinkedIn_System(new FeedService(), new AuthorizationService(), null);
        Form1 form = new Form1();
        form.email = "sujalsharma@gmail.com";
        form.password = "SujalSharma";
        linkedIn_System.register(form);
        linkedIn_System.login(form);
        linkedIn_System.createPost(new PostForm("Post_1"));
        linkedIn_System.createPost(new PostForm("Post_2"));
        linkedIn_System.showFeed();
        linkedIn_System.logout();
        linkedIn_System.createPost(new PostForm("Post_3"));
        linkedIn_System.showFeed();
    }
}
