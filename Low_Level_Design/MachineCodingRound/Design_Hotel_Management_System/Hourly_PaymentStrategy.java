package Low_Level_Design.MachineCodingRound.Design_Hotel_Management_System;

import java.time.temporal.ChronoUnit;

public class Hourly_PaymentStrategy implements PaymentStrategy {

    @Override
    public int calculateAmount(Booking booking) {
        return (int) ChronoUnit.HOURS.between(booking.checkin, booking.chekout) * 250;
    }

    @Override
    public String toString() {
        return "Hourly_PaymentStrategy []";
    }

}
