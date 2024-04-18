package org.example.JavaOOP;
/*
* Inheritance
* inheritance is a mechanism in which one object acquire all the properties and behaviors of a parent object
*
* the idea behind inheritance in java is to create a class that extends another class upon existing classes.
*
* inheritance represents IS-A relationship between two classes.
* Parent Child relationship
* where child acquires all the properties and behaviors of a parent object.
*
* terms used:
* Class
* Subclass / child
* Superclass / parent
* extends
*
*
 */
public class JavaInheritance {

    String brand;

   public JavaInheritance(String brand){
       this.brand = brand;
   }

   public void display(){
       System.out.println("Brand is: " + brand);
   }
}

class Car extends JavaInheritance{
    private int numOfWheels;
    public Car(String brand, int numOfWheels){
        super(brand);
        this.numOfWheels = numOfWheels;
    }

    public void drive(){
        System.out.println("Driving with "+ brand + " " + numOfWheels + " wheels");
    }
}

class motorcycle extends JavaInheritance{
    private boolean hasSideCar;

    public motorcycle(String brand,boolean hasSideCar){
        super(brand);
        this.hasSideCar = hasSideCar;
    }
    public void wheelie(){
        if (hasSideCar) {
            System.out.println("can not do wheelie with sideCar");
        } else {
            System.out.println("performing wheelie");
        }
    }
}

class JavaIn{
    public static void main(String[] args){
        Car car = new Car("BMW", 4);
        motorcycle motor = new motorcycle("Honda", false);

        car.display();
        motor.display();

        car.drive();
        motor.wheelie();
    }
}


//create a parent vehicle
// FourWheeler // car // truck
// TwoWheeler // Motorcycle // bike


//class motortype extends Motorcycle{
//
//