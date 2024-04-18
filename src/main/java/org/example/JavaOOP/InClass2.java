package org.example.JavaOOP;

public class InClass2 {
    public static void main(String[] args){
        VehicleOne vehicle = new VehicleOne();
        vehicle.move();

        VehicleOne vehicle1 = new CarOne();
        vehicle1.move();

        VehicleOne vehicle2 = new MotorcycleOne();
        vehicle2.move();
    }

}
class VehicleOne {
    void move(){
        System.out.println("The vehicle is moving.");
    }
}

class CarOne extends VehicleOne {
    @Override
    void move(){
        System.out.println("The car is driving on the road.");
    }
}

class MotorcycleOne extends VehicleOne{
    @Override
    void move(){
        System.out.println("The motorcycle is cruising on the highway");
    }
}