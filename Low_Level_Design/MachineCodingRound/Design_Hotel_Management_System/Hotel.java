package Low_Level_Design.MachineCodingRound.Design_Hotel_Management_System;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private static int hotelCounter = 1;
    private int hotelId;
    private String location;
    private List<Room> rooms;

    Hotel() {
        hotelId = hotelCounter++;
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        if (room != null) {
            rooms.add(room);
        }
    }

    public static int getHotelCounter() {
        return hotelCounter;
    }

    public static void setHotelCounter(int hotelCounter) {
        Hotel.hotelCounter = hotelCounter;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Hotel [hotelId=" + hotelId + ", location=" + location + ", rooms=" + rooms + "]";
    }

}
