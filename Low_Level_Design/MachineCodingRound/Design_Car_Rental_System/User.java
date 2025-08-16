package Low_Level_Design.MachineCodingRound.Design_Car_Rental_System;

public class User {
    private static int userCounter = 1;
    private int userId;
    private String userName;
    private Car rentedCar;
    public User(String name){
        this.userName = name;
        this.userId = userCounter++;
    }
    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", rentedCar="
                + rentedCar + "]";
    }
    public Car getRentedCar() {
        return rentedCar;
    }
    public void setRentedCar(Car rentedCar) {
        this.rentedCar = rentedCar;
    }
    
}
