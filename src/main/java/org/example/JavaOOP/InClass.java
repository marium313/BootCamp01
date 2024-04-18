package org.example.JavaOOP;

public class InClass {
    public static void main(String[] args){

        InClassCalculator a = new InClassCalculator();
        System.out.println(a.add(6,4));
        System.out.println(a.add(6,4,5));
        System.out.println(a.add(14.5f,14.5f));
        System.out.println(a.add(14.6f,14.7f,14.8f));
        System.out.println(a.subtract(4,5));
        System.out.println(a.subtract(8,4,5));
        System.out.println(a.subtract(3,5));
        System.out.println(a.subtract(3,5,9));
        System.out.println(a.multiply(6,4));
        System.out.println(a.multiply(6,4,9));
        System.out.println(a.multiply(6,4));
        System.out.println(a.multiply(14.5f,14.5f));
        System.out.println(a.divide(2,4));
        System.out.println(a.divide(4,8,10));
        System.out.println(a.divide(4.5,5.5, 6.6));
        System.out.println(a.divide(4.5,5.5,6.6));
        System.out.println(a.modulus(2,4));
        System.out.println(a.modulus(6,8,10));
        System.out.println(a.modulus(8,10));
        System.out.println(a.modulus(8,10,19));

    }
}

class InClassCalculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    float add(float a, float b) {
        return a + b;
    }

    float add(float a, float b, float c) {
        return a + b + c;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }

    float subtract(float a, float b) {
        return a - b;
    }

    float subtract(float a, float b, float c) {
        return a - b - c;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    float multiply(float a, float b) {
        return a * b;
    }

    float multiply(float a, float b, float c) {
        return a * b * c;
    }

    int divide(double a, double b, double v) {
        return (int) (a / b);
    }

    int divide(int a, int b, int c) {
        return a / b / c;
    }

    float divide(float a, float b) {
        return a / b;
    }

    float divide(float a, float b, float c) {
        return a / b / c;
    }

    int modulus(int a, int b) {
        return a % b;
    }

    int modulus(int a, int b, int c) {
        return a % b % c;
    }

    float modulus(float a, float b) {
        return a % b;
    }

    float modulus(float a, float b, float c) {
        return a % b % c;
    }
}