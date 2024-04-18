package org.example.JavaOOP;

public class JavaInheritanceHomework {
    public static void main(String [] args){
        car car1 = new car("Toyota", "Camry", 2022, 4, "Sedan");
        car1.displayInfo();
        car1.drive();
        car1.park();

        Bike bike1 = new Bike("Honda","CBR1000RR",2021,2,"sport");
        bike1.displayInfo();
        bike1.drive();
        bike1.deliverFood();

    }
}

class vehicle{
    String make;
    String model;
    int year;

    public vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo(){
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

class FourWheeler extends vehicle{
    int numWheels = 4;

    public FourWheeler(String make, String model, int year, int numWheels){
        super(make, model, year);
        this.numWheels = numWheels;
    }

    public void drive(){
        System.out.println("Four Wheeler is being driven.");
    }
}

// Child class of vehicle
class TwoWheeler extends vehicle{
    int numWheels = 2;

    public TwoWheeler(String make, String model, int year, int numWheels){
        super(make, model, year);
        this.numWheels = numWheels;
    }

    public void drive(){
        System.out.println("Two Wheeler is being driven.");
    }
}

// Subclass of FourWheeler
class car extends FourWheeler{
    String type = "car";

    public car(String make, String model, int year, int numWheels, String type){
        super(make, model, year, numWheels);
        this.type = type;
    }

    public void park(){
        System.out.println("car is being parked.");
    }
}

class Truck extends FourWheeler{
    String type = "Truck";

    public Truck(String make, String model, int year, int numWheels, String type){
        super(make,model,year,numWheels);
        this.type = type;
    }

    public void loadGoods(){
        System.out.println("Truck is loading goods");
    }
}

//subclass of TwoWheeler
class Motorcycle extends TwoWheeler {
    String type = "Motorcycle";

    public Motorcycle(String make, String model, int year, int numWheels, String type) {
        super(make, model, year, numWheels);
        this.type = type;
    }
}
//subclass of TwoWheeler
class Bike extends TwoWheeler{
    String type = "Bike";

    public Bike(String make, String model, int year, int numWheels, String type){
        super(make,model,year,numWheels);
        this.type = type;
    }

    public void deliverFood(){
        System.out.println("Bike is delivering food");
    }
}
