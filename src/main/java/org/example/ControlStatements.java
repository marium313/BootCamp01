package org.example;

import javax.swing.*;
import java.util.Random;

public class ControlStatements {

/*
control statements...

1> Decision making statements
* if else statements
* switch statements

2> Loop statements
* while loops
* for loops
do While loop
for Each loop

3> Jump statements
* Break
* Continue

* if else
* while loops
* for loops
* switch statements
 */

    public static void main(String[] args) {
        System.out.println(ifElse(10, 50));

        isAdult(24);
        evenORodd(80);
        intMarks(88);
        Largest(100, 200, 300);

        System.out.println("---------------");

        switchExample(5);
        Season(4);
        print1To10();
        print1To10Even();
        print1To10Odd();
        forEachExample();
        forEachExample2();

        System.out.println("---------------");
        whileExample();

        System.out.println("---------------");
        whileExample2();

        System.out.println("---------------");
        dice();
    }


    // simple example of if statement
    private static boolean ifElse(int a, int b) {
        if (a < b) {
            return true;
        } else {
            return false;
        }
    }

    public static void isAdult(int age) {
        if (age > 0 & age < 12) {
            System.out.println("child");
        } else if (age > 12 & age < 18) {
            System.out.println("teen");
        } else {
            System.out.println("adult");
        }
    }

    public static void evenORodd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

//int marks
// marks is less than 70 grade D
//marks is between 71-80 grade C
//marks is between 81-90 grade B
//over 90 is grade A

    public static void intMarks(int grade) {
        if (grade >= 90) {
            System.out.println("grade A");
        } else if (grade >= 80) {
            System.out.println("grade B");
        } else if (grade >= 70) {
            System.out.println("grade C");
        } else {
            System.out.println("grade D");
        }
    }

    // given 3 ints a, b, c find the largest number

    public static void Largest(int a, int b, int c) {
        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;

        }
        System.out.println("The largest number is: " + largest);
    }

//Switch statements
    /*
     * java switch statements executes one statement from multiple conditions
     * switch statement will check the equality of variable against multiple variables.
     */

    public static void switchExample(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("not a valid day of the week");

        }
    }

    // Which Season 12 months split into 4 seasons
    //   1 Winter
    //   2 Spring
    //   3 Summer
    //   4 Fall
    public static void Season(int Season) {
        switch (Season) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Winter");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Spring");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Summer");
                break;
            case 10:
                System.out.println("Fall");
                break;
            case 11:
                System.out.println("Fall");
                break;
            case 12:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month");

                System.out.println("The season should be: " + Season);

        }
    }

    // loops
    //      for loop
    //      the java for loop is used to iterate a part of the program
    //      several times. IF the number of iterations is fixed then it is recommended to use
    //      for loop
    public static void print1To10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

// numbers that are even from 1-10
// use for loop and if else condition

    public static void print1To10Even() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even numbers are: " + i);


            }
        }
    }

    public static void print1To10Odd() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd numbers are: " + i);
            }
        }
    }

    // For each loop
    // arrays
    // arrays are used to store data of similar data type into one single variable.
    int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void forEachExample() {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int ar : myArray) {
            System.out.println(ar + " ");

        }
        System.out.println();
    }

    public static void forEachExample2() {
        String[] mystrArr = {"Hello", "class", "this", "is", "JAVA"};
        for (String str : mystrArr) {
            System.out.println(str + " ");
        }

    }

    // While loop
    public static void whileExample() {
        int count = 0;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }
    }


    public static void whileExample2() {
        int count = 2;
        while (count <= 10) {
            System.out.println(count);
            count += 2;
        }
    }

    public static void dice() {
        Random random = new Random();
        int diceValue;
        do {
            diceValue = random.nextInt(6) + 1;
            System.out.println("value of dice: " + diceValue);
        } while (diceValue != 6);
    }


}