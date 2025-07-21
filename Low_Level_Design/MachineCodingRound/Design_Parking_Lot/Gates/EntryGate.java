package Low_Level_Design.MachineCodingRound.Design_Parking_Lot.Gates;

import Low_Level_Design.MachineCodingRound.Design_Parking_Lot.ParkingLot.ParkingLot;
import Low_Level_Design.MachineCodingRound.Design_Parking_Lot.Vehicle.Vehicle;

public class EntryGate {
    ParkingLot parkingLot;
    public EntryGate(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
    }
    public boolean parkMyVehicle(Vehicle vehicle){
        if(!parkingLot.isAvailable(vehicle)){
            System.out.println("Not Available.......");
            return false;
        }
        parkingLot.parkVehicle(vehicle);
        return true;
    }
}
