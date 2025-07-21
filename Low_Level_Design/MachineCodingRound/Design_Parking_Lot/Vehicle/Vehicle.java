package Low_Level_Design.MachineCodingRound.Design_Parking_Lot.Vehicle;

public class Vehicle {

    private int vehicleNumber;
    private VehicleType vehicleType;
    private Ticket ticket;
    public Vehicle(int vehicleNumber,VehicleType vehicleType){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }
    public int getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    
}