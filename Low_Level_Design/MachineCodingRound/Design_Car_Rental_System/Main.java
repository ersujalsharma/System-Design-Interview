package Low_Level_Design.MachineCodingRound.Design_Car_Rental_System;

public class Main {
    public static void main(String[] args) {
        CarRentalSystem carRentalSystem = new CarRentalSystem();
        carRentalSystem.addCity(City.Mau);
        carRentalSystem.addCarToCity(City.Mau, new Car());
        carRentalSystem.showCarsWithCity();
        User user = new User("Sujal Sharma");
        carRentalSystem.visitUser(user);
        carRentalSystem.rentCar();
        System.out.println(user);
    }
}
