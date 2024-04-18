package org.example.JavaOOP;

public class InClass4 {


    public static void main(String[] args) {
        System.out.println(EvryOther("Heeeololeo"));
        int[] arr = {1, 1, 2, 3, 1};
        Array123(arr);
        System.out.println(StringSplosion("Code"));
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(helloName("Marium"));
        System.out.println(firstHalf("YeeHaw"));
        System.out.println(endsLy("neatly"));
        System.out.println(seeColor("redding"));

        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 2, 3, 4, 5, 6};
        commonEnd(a, b);
        System.out.println(commonEnd(a, b));
        System.out.println(start1(a, b));

    }


    public static String EvryOther(String str) {
        String result ="";
        for (int i = 0; i < str.length(); i += 2) {
            result = result + str.substring(i, i + 1);
        }
        return result;
    }

    public static boolean Array123(int[] arr) {
        for (int i = 0; i < (arr.length - 2); i++) {
            if (arr[i] == 1 && arr[i + 1] == 2 && arr[i + 2] == 3)
                return true;
        }
        return false;

    }

    public static String StringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i + 1);
        }
        return result;
    }

    public static String frontTimes(String str, int n) {
        if (n == 0) return "";
        if (str.length() < 4) return str + frontTimes(str, n - 1);
        return frontTimes(str.substring(0, 3), n);
    }

    public static String helloName(String name) {
        return ("Hello " + name + "!");
    }

    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public static boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        }
        return (str.substring(str.length() - 2).equals("ly"));
    }

    public static String seeColor(String str) {
        if (str.startsWith("red"))
            return "red";
        if (str.startsWith("blue"))
            return "blue";
        return " ";
    }

    public static boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        }return false;
    }

    public static int start1(int[] a, int[] b) {
        int count = 0;

        if (a.length > 0 && a[0] == 1)
            count++;

        if (b.length > 0 && b[0] == 1)
            count++;

        return count;
    }

    public static int Addition(int num1, int num2) {
        return num1 + num2;
    }
}






// Given a string and non-negative int n, we'll say that the front of the string is the first 3 chars,
// or whatever is there if the string is less than length 3. Return n copies of the front;
//frontTimes("Chocolate", 2) -> "ChoCho"
//frontTimes("Chocolate", 3) -> "ChoChoCho"
//frontTimes("abc", 3) -> "AbcAbcAbc

//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!"
//helloName("Bob") -> "Hello Bob!"
//helloName("Alice") -> "Hello Alice!"
//helloName("X") -> "Hello X!"

// Given a string of even length, return the first half. So the string "Woohoo" yields "Woo".
//firstHalf("Woohoo") -> "Woo"
//firstHalf("HelloThere") -> "Hello"
//firstHalf("abcdef") -> "abc"

//Given a string, return true if it ends in "ly".
//endsLy("oddly") -> true
//endsLy("y") -> false
//endsLy("oddy") -> false

//Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
//seeColor("redxx") -> "red"
//seeColor("xxred") -> ""
//seeColor("blueTimes") -> "blue"

//Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
//Both arrays will be length 1 or more.
//commonEnd([1, 2, 3], [7, 3]) => true
//commonEnd([1, 2, 3], [7, 3, 2]) => false
//commonEnd([1, 2, 3], [1, 3]) => true

//Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
//start1([1, 2, 3], [1, 3]) -> 2
//start1([7, 2, 3], [1]) -> 1
//start1([1, 2], []) -> 1





/*
* Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
*
*
stringBits("Hello") -> "Hlo"
stringBits("Hi") -> "H"
stringBits("Heeololeo") -> "Hello"
*
*
*
* Given an array of ints, return true if the sequence of numbers 1,2,3 appears in the array somewhere.
*
array123([1, 2, 3, 1]) -> true
array123([1, 2, 4, 1]) -> false
array123([1, 1, 2, 1, 2, 3]) -> true
*
*
* Given a non-empty string like "Code" return a string like "CCoCodCode".
*
*
* stringSplosion("Code") -> "CCoCodCode"
* stringSplosion("abc") -> "aababc"
* stringSplosion("ab") -> "aab"
*
 */


