abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
    
    void displayInfo() {
        System.out.println("Fuel Type: " + fuelType());
        System.out.println("Number of Wheels: " + noOfWheels());
    }
}

class Car extends Vehicle {
    String fuelType() {
        return "Petrol/Diesel";
    }
  
    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {
    String fuelType() {
        return "Petrol";
    }
    
    int noOfWheels() {
        return 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        
        System.out.println("--- Car Details ---");
        car.displayInfo();
        
        System.out.println("\n--- Bike Details ---");
        bike.displayInfo();
    }
}
