package Low_Level_Design.MachineCodingRound.Design_Parking_Lot.Gates;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import Low_Level_Design.MachineCodingRound.Design_Parking_Lot.ParkingLot.ParkingLot;
import Low_Level_Design.MachineCodingRound.Design_Parking_Lot.Vehicle.Ticket;
import Low_Level_Design.MachineCodingRound.Design_Parking_Lot.Vehicle.VehicleType;

public class ExitGate {
    private ParkingLot parkingLot;
    public ExitGate(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
    }
    public long unParkVehicle(Ticket ticket){
        LocalDateTime entryTime = ticket.getLocalDateTime();
        long hours = ChronoUnit.HOURS.between(entryTime, LocalDateTime.now());
        ticket.getParkingSpot().setAvailable(true);
        long price = ticket.getVehicle().getVehicleType() == VehicleType.TwoWheeler ? 10 * hours : 40 * hours;
        ticket.getVehicle().setTicket(null);
        return price;
    }
    public ParkingLot getParkingLot() {
        return parkingLot;
    }
}
