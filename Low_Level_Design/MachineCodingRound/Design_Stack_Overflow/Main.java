package Low_Level_Design.MachineCodingRound.Design_Stack_Overflow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Sujal");
        Question question1 = new Question("What is your name ???", "By which we can identify you..", user1);
        List<Question> list = new ArrayList<>();
        list.add(question1);
        StackOverflowPlatform stackOverflowPlatform = new StackOverflowPlatform(list);
        stackOverflowPlatform.printList();
        stackOverflowPlatform.login(user1);
        // stackOverflowPlatform.logout();
        Question question2 = new Question("What is your Age ??", "By which we can judge you...", user1);
        stackOverflowPlatform.addQuestion(question2);
        User user2 = new User("Sujal2");
        Answer answer = new Answer("answer1", "18", user2);
        answer.approvedAnswer();
        question2.addAnswers(answer);
        question1.upVote(user2);
        question1.downVote(user2);
        System.out.println();
        stackOverflowPlatform.printList();
    }
}
