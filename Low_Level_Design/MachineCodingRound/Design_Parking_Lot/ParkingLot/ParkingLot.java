package Low_Level_Design.MachineCodingRound.Design_Parking_Lot.ParkingLot;

import java.util.ArrayList;
import java.util.List;

import Low_Level_Design.MachineCodingRound.Design_Parking_Lot.ParkingSpots.ParkingSpot;
import Low_Level_Design.MachineCodingRound.Design_Parking_Lot.Vehicle.Ticket;
import Low_Level_Design.MachineCodingRound.Design_Parking_Lot.Vehicle.Vehicle;
import Low_Level_Design.MachineCodingRound.Design_Parking_Lot.Vehicle.VehicleType;

public class ParkingLot {
    List<ParkingSpot> twoWheeler;
    List<ParkingSpot> fourWheeler;
    public ParkingLot(){
        twoWheeler = new ArrayList<>();
        fourWheeler = new ArrayList<>();
    }
    public void addParkingLot(ParkingSpot parkingSpot){
        if(parkingSpot.getVehicleType().equals(VehicleType.TwoWheeler)){
            twoWheeler.add(parkingSpot);
        }
        else{
            fourWheeler.add(parkingSpot);
        }
    }
    public boolean isAvailable(Vehicle vehicle){
        VehicleType vehicleType = vehicle.getVehicleType();
        if(vehicleType == VehicleType.TwoWheeler){
            for(int i=0;i<twoWheeler.size();i++){
                if(twoWheeler.get(i).isAvailable()){
                    return true;
                }
            }
        }
        else{
            for(int i=0;i<fourWheeler.size();i++){
                if(fourWheeler.get(i).isAvailable()){
                    return true;
                }
            }
        }
        return false;
    }
    public void parkVehicle(Vehicle vehicle){
        VehicleType vehicleType = vehicle.getVehicleType();
        ParkingSpot freeParkingSpot = null;
        if(vehicleType == VehicleType.TwoWheeler){
            for(int i=0;i<twoWheeler.size();i++){
                if(twoWheeler.get(i).isAvailable()){
                    freeParkingSpot = twoWheeler.get(i);
                    break;
                }
            }
        }
        else{
            for(int i=0;i<fourWheeler.size();i++){
                if(fourWheeler.get(i).isAvailable()){
                    freeParkingSpot = fourWheeler.get(i);
                    break;
                }
            }
        }
        if(freeParkingSpot!=null){
            freeParkingSpot.setAvailable(false);
            Ticket ticket = new Ticket(vehicle, freeParkingSpot);
            vehicle.setTicket(ticket);
        }
    }
}
