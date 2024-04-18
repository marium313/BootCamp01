package org.example;

public class JavaArrays {
    public static void main(String[] args) {
aboutArrays();
aboutArrays2();

System.out.println();
System.out.println("=====================");

multidimArray();

    }

    public static void aboutArrays() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(arr[4]);
    }

    public static void aboutArrays2() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void multidimArray(){
        int arr[][] = {{1,2,3}, {4,5,6}};

        for (int i =0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    /*
    *We'll say that a number is "teen" if it is in the range 13...19 inclusive.
    * Given 3 int values, return true if 1 or more of them are teen.
    *
    * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
    *
    * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0...23. We are in
    * trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
    *
    * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
    *
    * Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
    *  Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
    *
    * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
    *
    * Given 2 int, a and b, return true if one of them is 10 or their sum is 10.
    *
    * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
    * or return 0 if neither is in that range.
    *
    * Given 2 int value, return true if either of them is in the range 10..20 inclusive.
    *
    * Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
    */
}
