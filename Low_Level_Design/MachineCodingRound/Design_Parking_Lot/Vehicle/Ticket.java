package Low_Level_Design.MachineCodingRound.Design_Parking_Lot.Vehicle;

import java.time.LocalDateTime;

import Low_Level_Design.MachineCodingRound.Design_Parking_Lot.ParkingSpots.ParkingSpot;

public class Ticket {
    private static int counter = 0;
    private int id;
    private Vehicle vehicle;
    private LocalDateTime localDateTime;
    private ParkingSpot parkingSpot;
    public Ticket(Vehicle vehicle,ParkingSpot parkingSpot){
        this.id = counter++;
        this.vehicle = vehicle;
        this.localDateTime = LocalDateTime.now();
        this.parkingSpot = parkingSpot;
    }
    public static int getCounter() {
        return counter;
    }
    public int getId() {
        return id;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
    public static void setCounter(int counter) {
        Ticket.counter = counter;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
    
}
