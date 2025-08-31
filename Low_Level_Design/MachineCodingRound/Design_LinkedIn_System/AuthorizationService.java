package Low_Level_Design.MachineCodingRound.Design_LinkedIn_System;

public class AuthorizationService {
    public User login(Form1 form){
        if(form.email == "sujalsharma@gmail.com" && form.password=="SujalSharma"){
            return new User();
        }
        return null;
    }
    public User register(Form1 form){
        User user = new User();
        user.email = form.email;
        user.password = form.password;
        return user;
    }
}
