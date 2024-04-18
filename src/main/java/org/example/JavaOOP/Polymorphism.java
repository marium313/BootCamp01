package org.example.JavaOOP;
/*
* Polymorphism in Java refers to the ability of objects of different classes to be treated
* as objects of a common super class. It allows objects of different classes to be treated
* uniformly through a single interface.
*
* there are two main types of polymorphism
* compile time
* run time
*
* compile time(Method Overloading):
* Method overloading occurs when a class has multiple methods with the same name
* but different parameters. During the compilation of the Java compiler determines which method
* to execute based on the number of parameters.
*
*
* run time (Method Overriding):
* Method overriding occurs when a subclass provides a specific implementation of a method
* that is already defined in its superclass. The subclass can override the behavior of the method
* defined in its superclass. The determination of which method to execute happens at runtime based on the
* actual object type.
*
*
 */
public class Polymorphism {
    public static void main(String[] args){

        Calculator c = new Calculator();
        System.out.println(c.add(5,3));
        System.out.println(c.add(5,3,4));
        System.out.println(c.add(12.5f,14.5f));

        Animal animal = new Animal();
        animal.sound();

        Animal animal2 = new Dog();
        animal2.sound();

        System.out.println("+++++++++++++++++++++++++++++++++++");

        Shape shape = new Circle();
        System.out.println(shape.calculateArea());
        Shape shape2 = new Rectangle();
        System.out.println(shape2.calculateArea());
        Shape shape3 = new Triangle();
        System.out.println(shape3.calculateArea());

        System.out.println("+++++++++++++++++++++++++++++++");
        Messaging messaging = new Messaging();
        messaging.sendMessage("Hello");
        messaging.sendMessage("ABC", "meet me @ 2 o'clock");
        messaging.sendMessage(12.25f,"is good then",1);


    }
}
// java method Overloading

class Calculator{
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
    float add(float a, float b){
        return a+b;
    }
}

// java method Overriding
class Animal{
    void sound(){
        System.out.println("Animal is making a sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog is making a sound");
    }
}

// java method Overriding
class Shape {
    double calculateArea() {
        return 0;
    }
}
class Circle extends Shape{
    double radius = 5.15;
    @Override
    double calculateArea(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
    double width = 4;
    double length = 5;
    @Override
    double calculateArea(){
        return width*length;
    }
}
class Triangle extends Shape{
    double base = 3;
    double height = 4;

    @Override
    double calculateArea(){
        return (base*height)/2;
    }
}

class Messaging{
    void sendMessage(String message){
        System.out.println(message);
    }
    void sendMessage(String message, String message2){
        System.out.println(message + " " + message2);
    }
    void sendMessage(float message, String message2, int message3) {
        System.out.println(message + " " + message2 + " " + message3);
    }
}
