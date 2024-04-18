package org.example.JavaOOP;
/*
*A class which is declared abstract keyword as abstract class in JAVA. It can have abstract and non-abstract methods.
*Abstraction is a process of hiding the implementation details of a class from the outside world/user.
*
* Another way, it shows only essential things to the user and hides the internal details, for example sending SMS messages where
* you type the text and send the message to the user. You do not know the internal processing about the message delivery system.
*
* there are two ways to implement an abstract class:
* 1> abstract class
* 2> Interface
*
* points to remember:
* abstract class must be declared with an interface keyword
* it can not be instantiated.
* it can have constructors and static and methods.
* it can have final methods which will force the subclass not to change the body of the method.
* abstract and non-abstract methods could be a part of an abstract class.
*
 */

public class Abstraction {
    public static void main(String [] args) {
        Circles circle = new Circles(5);
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Perimeter of circle: " + circle.perimeter());

        Rectangles rectangle = new Rectangles(4,6);
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());

    }
}

abstract class Shapes {
    abstract double area();
    abstract double perimeter();
}

class Circles extends Shapes{
    double radius;

    Circles(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter(){
        return 2 * Math.PI * radius;
    }
}

class Rectangles extends Shapes{
    double length;
    double width;

    Rectangles(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length * width;
    }

    @Override
    double perimeter(){
        return 2 * (length + width);
    }

}