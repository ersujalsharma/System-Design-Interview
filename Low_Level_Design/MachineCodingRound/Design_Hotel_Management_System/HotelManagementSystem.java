package Low_Level_Design.MachineCodingRound.Design_Hotel_Management_System;

import java.time.LocalDateTime;
import java.util.List;

public class HotelManagementSystem {
    List<Hotel> hotelList;
    Hotel currentHotel;
    List<Booking> bookings;

    HotelManagementSystem(List<Hotel> list) {
        hotelList = list;
    }

    public Booking bookRoom(Room room, User user, PaymentStrategy paymentStrategy) {
        room.setBooked(true);
        Booking booking = new Booking(user, room);
        if (bookings == null) {
            bookings = new java.util.ArrayList<>();
        }
        booking.strategy = paymentStrategy;
        bookings.add(booking);
        System.out.println("Room booked successfully: " + booking);
        return booking;
    }

    public Integer checkOut(Booking booking) {
        // booking.user = null;
        // booking.chekout = LocalDateTime.now();
        // booking.room.setBooked(false);
        // int val = booking.strategy.calculateAmount(booking);
        // return val;
        booking.user = null;
        booking.chekout = LocalDateTime.now();
        booking.room.setBooked(false);
        int amount = booking.strategy.calculateAmount(booking);
        return amount;
    }

    public void showBooking() {
        if (bookings == null || bookings.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }

    Room findAvailableRoom(RoomType roomType) {
        List<Room> list = currentHotel.getRooms();
        for (Room r : list) {
            if (!r.isBooked()) {
                return r;
            }
        }
        return null;
    }

    void chooseHotel(Hotel hotel) {
        currentHotel = hotel;
    }

    public void showHotels() {
        for (Hotel hotel : hotelList) {
            System.out.println(hotel);
        }
    }

    public Hotel getCurrentHotel() {
        return currentHotel;
    }

    public void setCurrentHotel(Hotel currentHotel) {
        this.currentHotel = currentHotel;
    }

    @Override
    public String toString() {
        return "HotelManagementSystem [hotelList=" + hotelList + ", currentHotel=" + currentHotel
                + ", bookings=" + bookings + "]";
    }

}
