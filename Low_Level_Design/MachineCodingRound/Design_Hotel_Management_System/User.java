package Low_Level_Design.MachineCodingRound.Design_Hotel_Management_System;

public class User {
    private static int userCounter = 1;
    private int userId;
    private Booking booking;

    public User() {
        userId = userCounter;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", booking=" + booking + "]";
    }

}
