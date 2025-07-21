package Low_Level_Design.MachineCodingRound.Design_Parking_Lot.ParkingSpots;

import Low_Level_Design.MachineCodingRound.Design_Parking_Lot.Vehicle.VehicleType;

public class ParkingSpot {
    private static int counter;
    private int parkingLotId;
    private VehicleType vehicleType;
    private boolean isAvailable;
    public ParkingSpot(VehicleType vehicleType){
        this.parkingLotId = counter++;
        this.vehicleType = vehicleType;
        this.isAvailable = true;        
    }
    public int getParkingLotId() {
        return parkingLotId;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
}