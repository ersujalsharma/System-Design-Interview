package Low_Level_Design.MachineCodingRound.Design_LinkedIn_System;

import java.util.List;

public class Connection {
    List<User> connectedUsers;

    public Connection(List<User> connectedUsers) {
        this.connectedUsers = connectedUsers;
    }
}