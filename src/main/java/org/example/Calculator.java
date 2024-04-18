package org.example;

public class Calculator {
    public static void main(String[] args){
        System.out.println("Addition: " + add(5, 3));
        System.out.println("Subtraction: " + subtract(5, 3));
        System.out.println("Multiplication: " + multiply(5, 3));
        System.out.println("Division: " + divide(5, 3));
        System.out.println("Modulus: " + modulus(5, 3));
        System.out.println("Increment: " + increment(5));
        System.out.println("Decrement: " + decrement(5));
    }

    //Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    //Method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    //Method to multiple two numbers
    public static int multiply(int a, int b) {
        return a * b;

    }

    //Method to divide two numbers
    public static double divide(double a, double b) {
        return a / b;
    }

    //Method to find the modulus of two numbers
    public static int modulus(int a, int b) {
        return a % b;
    }

    //Method to increment a number
    public static int increment(int a) {
        return ++a; //Pre-increment to increment and then return the value
    }

    //Method to decrement a number
    public static int decrement(int a) {
        return --a; // Pre-decrement to decrement and then return the value
    }
}

