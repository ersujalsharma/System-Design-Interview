package Low_Level_Design.MachineCodingRound.Design_LinkedIn_System;

public class User {
    int id;
    String username;
    String email;
    String password;
    Profile profile;
    Connection connection;
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
                + ", profile=" + profile + ", connection=" + connection + "]";
    }
}
