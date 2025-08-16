package Low_Level_Design.MachineCodingRound.Design_Car_Rental_System;

public class Car {
    static int carCounter = 1;
    private String carNumber;
    private boolean isAvailable;
    public Car(){
        this.carNumber = "UP"+carCounter;
        isAvailable = true;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public String getCarNumber() {
        return carNumber;
    }
    @Override
    public String toString() {
        return "Car [carNumber=" + carNumber + ", isAvailable=" + isAvailable +"]";
    }
    
}
