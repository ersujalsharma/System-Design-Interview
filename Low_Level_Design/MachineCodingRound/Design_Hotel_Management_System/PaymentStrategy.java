package Low_Level_Design.MachineCodingRound.Design_Hotel_Management_System;

public interface PaymentStrategy {
    public int calculateAmount(Booking booking);
}
