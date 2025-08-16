package Low_Level_Design.MachineCodingRound.Design_Car_Rental_System;

import java.util.*;

public class CarRentalSystem {
    Map<City,List<Car>> cityToCars;
    private User visitedUser;
    public CarRentalSystem(){
        cityToCars = new HashMap<>();
    }
    public void visitUser(User user){
        visitedUser = user;
    }
    public void addCity(City city){
        cityToCars.put(city,new ArrayList<>());
    }
    public void removeCity(City city){
        cityToCars.remove(city);
    }
    public void addCarToCity(City city, Car car) {
        List<Car> cars = cityToCars.get(city);
        if (cars != null) {
            cars.add(car);
        }
    }

    public void removeCarFromCity(City city, Car car) {
        List<Car> cars = cityToCars.get(city);
        if (cars != null) {
            cars.remove(car);
        }
    }
    public void rentCar(){
        if (visitedUser == null) {
            System.out.println("No user is currently visiting.");
            return;
        }
        System.out.println("Available cities:");
        int idx = 1;
        List<City> cities = new ArrayList<>(cityToCars.keySet());
        for (City city : cities) {
            System.out.println(idx + ". " + city);
            idx++;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select city number: ");
        int cityChoice = scanner.nextInt();
        if (cityChoice < 1 || cityChoice > cities.size()) {
            System.out.println("Invalid city selection.");
            return;
        }
        City selectedCity = cities.get(cityChoice - 1);
        List<Car> cars = cityToCars.get(selectedCity);
        List<Car> availableCars = new ArrayList<>();
        idx = 1;
        System.out.println("Available cars in " + selectedCity + ":");
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(idx + ". " + car);
                availableCars.add(car);
                idx++;
            }
        }
        if (availableCars.isEmpty()) {
            System.out.println("No available cars in this city.");
            return;
        }
        System.out.print("Select car number: ");
        int carChoice = scanner.nextInt();
        if (carChoice < 1 || carChoice > availableCars.size()) {
            System.out.println("Invalid car selection.");
            return;
        }
        Car selectedCar = availableCars.get(carChoice - 1);
        selectedCar.setAvailable(false);
        rentCarToUser(selectedCity, selectedCar);
        System.out.println("Car rented successfully: " + selectedCar);
    }
    private void rentCarToUser(City city, Car car) {
        visitedUser.setRentedCar(car);
    }

    public void userCameToReturnCar(City city) {
        Car car = visitedUser.getRentedCar();
        car.setAvailable(true);
    }
    public void showCarsWithCity() {
        for (Map.Entry<City, List<Car>> entry : cityToCars.entrySet()) {
            City city = entry.getKey();
            List<Car> cars = entry.getValue();
            System.out.println("City: " + city);
            for (Car car : cars) {
                System.out.println("  Car: " + car.toString());
            }
        }
    }
}
