package Low_Level_Design.MachineCodingRound.Design_Hotel_Management_System;

public class Room {
    boolean booked;
    RoomType roomType;

    Room(RoomType roomType) {
        this.roomType = roomType;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Room [booked=" + booked + ", roomType=" + roomType + "]";
    }

}
