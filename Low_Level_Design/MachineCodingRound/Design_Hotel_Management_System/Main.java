package Low_Level_Design.MachineCodingRound.Design_Hotel_Management_System;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Hotel hotel1 = new Hotel();
        // hotel1.addRoom(new Room(RoomType.DELUX));
        // hotel1.addRoom(new Room(RoomType.LUXURY));
        // List<Hotel> list = new ArrayList<>();
        // list.add(hotel1);
        // HotelManagementSystem hms = new HotelManagementSystem(list);
        // User user = new User();
        // hms.showHotels();
        // hms.setCurrentHotel(hotel1);
        // Room room = hms.findAvailableRoom(RoomType.DELUX);
        // Booking booking = hms.bookRoom(room, user, new DayWise_PaymentStrategy());
        // int val = hms.checkOut(booking);
        // System.out.println("Checked out successfully. Total amount: " + val);
        Hotel sampleHotel = new Hotel();
        sampleHotel.addRoom(new Room(RoomType.DELUX));
        sampleHotel.addRoom(new Room(RoomType.LUXURY));
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(sampleHotel);
        HotelManagementSystem hotelManagementSystem = new HotelManagementSystem(hotels);
        User guestUser = new User();
        hotelManagementSystem.showHotels();
        hotelManagementSystem.setCurrentHotel(sampleHotel);
        Room availableRoom = hotelManagementSystem.findAvailableRoom(RoomType.DELUX);
        Booking userBooking = hotelManagementSystem.bookRoom(availableRoom, guestUser, new DayWise_PaymentStrategy());
        int totalAmount = hotelManagementSystem.checkOut(userBooking);
        System.out.println("Checked out successfully. Total amount: " + totalAmount);
    }
}
