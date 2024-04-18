package org.example;

public class Homework1 {
    public static void main(String[] args) {

        System.out.println(teen(20, 21, 18));
        System.out.println(monkeys(true, true));
        System.out.println(hour(7, 20));
        System.out.println(temperatures(-1, 200));
        System.out.println(LastDigit(29, 45));
        System.out.println(Sum(55, 5));
        System.out.println(Sum2(8, 10));
        System.out.println(Sum3(14, 8));
        System.out.println(Sum4(21, 11));
        System.out.println(MultipleOf5or3(19));


    }

//We'll say that a number is "teen" if it is in the range 13...19 inclusive.
//Given 3 int values, return true if 1 or more of them are teen.
    public static boolean teen(int a, int b, int c) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19) {
            return true;
        }
        return false;
    }

//We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
//We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
    public static boolean monkeys(boolean aSmile, boolean bSmile) {
        if (!aSmile || bSmile) {
            return true;
        }
        return false;
    }

//We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0...23. We are in
//trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
    public static boolean hour(int a, int b) {
        if (a < 7 && b > 20) {
            return true;
        }
        return false;
    }

//Given two temperatures, return true if one is less than 0 and the other is greater than 100.
    public static boolean temperatures(int a, int b) {
        if (a < 0 && b > 100) {
            return true;
        }
        return false;
    }

//Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
//Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
    public static boolean LastDigit(int a, int b) {
        if (a % 10 == b % 10) {
            return true;
        }
        return false;
    }

//Given two int values, return their sum. Unless the two values are the same, then return double their sum.
    public static int Sum(int a, int b) {
        if (a == b) {
            return ((a + b) * 2);
        } else {
            return a + b;
        }
    }

//Given 2 int, a and b, return true if one of them is 10 or their sum is 10.
    public static boolean Sum2(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        }
        return false;
    }

//Given 2 int value, return true if either of them is in the range 10..20 inclusive.
    public static boolean Sum4(int a, int b) {
        if (a >= 10 && a <= 20 || b >= 10 && b <= 20) {
            return true;
        }
        return false;
    }

//Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
    public static boolean MultipleOf5or3(int n) {
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        }
        return false;
    }


//Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
//or return 0 if neither is in that range.
    public static int Sum3(int a, int b) {
        if(a > b && a >= 10 && a <= 20){
            return a;


        }else if (b > a && b >= 10 && b <= 20){
            return b;

        }else
            return 0;

    }

}

















