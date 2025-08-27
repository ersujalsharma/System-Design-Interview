package Low_Level_Design.MachineCodingRound.Design_Hotel_Management_System;

import java.time.temporal.ChronoUnit;

public class DayWise_PaymentStrategy implements PaymentStrategy {

    @Override
    public int calculateAmount(Booking booking) {
        return (int) ChronoUnit.DAYS.between(booking.checkin, booking.chekout) * 1000;
    }

    @Override
    public String toString() {
        return "DayWise_PaymentStrategy []";
    }

}
