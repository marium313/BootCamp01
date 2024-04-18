package org.example;



public class FirstClass {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a+b);

        String abcd = "Hello World";
        System.out.println(abcd);

        // this is how I write comments / notes

        /*
        this is how I write comments / notes
        this is multiple line comments
         */

        /*
        * Data Types in Java
        *
        * 1> Primitive Data types
        * 2> Non Primitive Data types
        *
        * Primitive Data types
        * boolean - true or false
        * byte - very tiny numbers
        * short - small numbers
        * int - big numbers
        * long - very big numbers
        * float - number with decimal up to 9 points
        * double - number with decimal down to 19 points
        * char - letter from a - z single letters 'a'
        *
        * NON PRIMITIVE DATA TYPES
        * CLASSES
        * INTERFACES
        * ARRAYS
        * STRINGS - "WORDS / LINES OR PARAGRAPHS"
        *
         */
        /*
        * Operators
        * Arithmetic operations
        * Logical Operators
        * Assignment Operators
        * Comparison Operators
        * Shift Operator
        *
        *
        * Arithmetic Operations
        * + additions
        * - subtractions
        * / division
        * * Multiplication
        * % Mod
        * ++ increment
        * -- decrement
        *
        *
        * Logical Operators
        * && AND
        * || OR
        *
        * Assignment Operators
        * = equals
        * ! not equals
        * +=
        * -=
        * /=
        * *=
        * %=
        *
        * Comparison Operators
        * < less
        * > greater
        * <= less equal
        * >= greater equal
        * == strict equal
        *
        * Shift Operators
        * <<
        * >>
        * >>>
        *
         */


        int abc = 10;
        byte aaa = 8;
        long bbb = 1000;
        short sss = 100;
        boolean bol = true;
        float f = 10.9898f;
        double dd = 98.99999d;

        System.out.println(abc);
        System.out.println(aaa);
        System.out.println(bbb);
        System.out.println(sss);
        System.out.println(bol);
        System.out.println(f);
        System.out.println(dd);

        System.out.println("----------------------------");

        String str = "Hello class this is our first java code";
        System.out.println(str);

        // methods --
        // a method in java is nothing but a set of instruction that need to
        // be followed to achieve a certain goal

        // we use method to easily modify java code multiple times
        // we can code a set of instructions and use it multiple times as it is reusable
        // method only runs when we call it or invoke it in main method of the class or into another method




        // access modifier           return type         name of method          Parameters
        // public                     int/void            sum                     ()  {
        // code/logic
        // }

        sum();
        sum1();
        sum2(10,20);;
        sum3(100,20);


    }
    // void method without parameters
    public static void sum(){
        int a = 10;
        int b = 100;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);


    }

    // return type method without parameters

    public static float sum1(){
        float a = 10.0f;
        int b = 10;
        System.out.println(a+b);
        return a+b;
    }

    // method with void and parameters
    public static void sum2 (int a, int b){
        System.out.println(a+b);
    }

    // method with return types and parameters
    public static int sum3 (int a, int b){
        System.out.println(a+b);
        return a+b;
    }

}

//create a class called calculator and write method with parameters to do all calculations

