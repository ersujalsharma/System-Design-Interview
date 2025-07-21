package Low_Level_Design.MachineCodingRound.Design_Parking_Lot;


import Low_Level_Design.MachineCodingRound.Design_Parking_Lot.Gates.EntryGate;
import Low_Level_Design.MachineCodingRound.Design_Parking_Lot.Gates.ExitGate;
import Low_Level_Design.MachineCodingRound.Design_Parking_Lot.ParkingLot.ParkingLot;
import Low_Level_Design.MachineCodingRound.Design_Parking_Lot.ParkingSpots.ParkingSpot;
import Low_Level_Design.MachineCodingRound.Design_Parking_Lot.Vehicle.Vehicle;
import Low_Level_Design.MachineCodingRound.Design_Parking_Lot.Vehicle.VehicleType;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Vehicle vehicle = new Vehicle(1, VehicleType.TwoWheeler);
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.addParkingLot(new ParkingSpot(VehicleType.FourWheeler));
        parkingLot.addParkingLot(new ParkingSpot(VehicleType.TwoWheeler));
        EntryGate entryGate = new EntryGate(parkingLot);
        boolean parked = entryGate.parkMyVehicle(vehicle);
        System.out.println(parked);
        Thread.sleep(2000);
        if(parked){
            ExitGate exitGate = new ExitGate(parkingLot);
            double price = exitGate.unParkVehicle(vehicle.getTicket());
            System.out.println(vehicle.getVehicleNumber()+" the rent is - "+price);
        }
    }
}
