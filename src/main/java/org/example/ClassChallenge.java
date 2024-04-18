package org.example;

public class ClassChallenge {
    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(isWithin100(195));

    }


//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
// We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    //Given an int n, return true if it is within 10 of 100 or 200. 90-110, 190-210
    public static boolean isWithin100(int n) {
        if (n >= 90 && n <= 110 || n >= 190 && n <= 210) {
            return true;
        }
        return false;
    }
}



