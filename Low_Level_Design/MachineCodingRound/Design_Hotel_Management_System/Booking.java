package Low_Level_Design.MachineCodingRound.Design_Hotel_Management_System;

import java.time.LocalDateTime;

public class Booking {
    private static int counter = 1;
    int id;
    User user;
    Room room;
    LocalDateTime checkin;
    LocalDateTime chekout;
    PaymentStrategy strategy;

    public Booking(User user, Room room) {
        this.id = counter;
        this.user = user;
        this.room = room;
        this.checkin = LocalDateTime.now().minusDays(7);
    }

    @Override
    public String toString() {
        return "\nBooking [id=" + id + ",\n user=" + user + ",\n room=" + room + ",\n checkin=" + checkin + ",\n chekout="
                + chekout + ",\n strategy=" + strategy + "]";
    }

}
