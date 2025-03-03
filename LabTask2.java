//Create an abstract class Vehicle with variables vehicleNumber (String) and fuelType (String) to store vehicle
//details and an abstract method calculateFare(int distance) that will be implemented by subclasses to calculate fare based
//on the distance traveled. The class should also have a method showDetails() to display vehicle details.
//Then, create two subclasses: Car and Bike. The Car class should calculate fare as distance * 10, while the Bike class should calculate fare
//as distance * 5. In the main method of a Main class, create instances of both Car and Bike, set their vehicle details, and print
//their details along with the fare for a given distance using the appropriate methods.


abstract class Vehicle {
    String vehicleNumber;
    String fuelType;

    public Vehicle(String vehicleNumber, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.fuelType = fuelType;
    }

    public abstract int calculateFare(int distance);

    public void showDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    public Car(String vehicleNumber, String fuelType) {
        super(vehicleNumber, fuelType);
    }

    public int calculateFare(int distance) {
        return distance * 10;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, String fuelType) {
        super(vehicleNumber, fuelType);
    }

    public int calculateFare(int distance) {
        return distance * 5;
    }
}

public class LabTask2 {
    public static void main(String[] args) {
        Vehicle car = new Car("ABCD", "Petrol");
        Vehicle bike = new Bike("EFGH", "Petrol");

        car.showDetails();
        System.out.println("Car Fare for 10 km: " +car.calculateFare(10));

        bike.showDetails();
        System.out.println("Bike Fare for 5 km: " + bike.calculateFare(5));
    }
}