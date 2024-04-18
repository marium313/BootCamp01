package org.example;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello class this is a string";


        //.concat
        //.charAt
        //.length
        //.substring
        //.indexOf
        //.replace
        //.replaceAll
        //.split
        //.startsWith
        //.endsWith
        //.trim
        //.toUpperCase
        //.toLowerCase
        //.valueOf
        //.contains

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.length());
        System.out.println(s.concat("and java is fun"));
        System.out.println(s.indexOf('v'));
        System.out.println(s.substring(4, 10));
        System.out.println(s.startsWith("Hello"));
        System.out.println(s.endsWith("fun"));
        System.out.println(s.charAt(0));
        System.out.println(s.replace("java is fun", "java is not fun"));
        System.out.println(s.replaceAll("a", "A"));
        System.out.println(s.split("a"));
        System.out.println(s.valueOf(2));
        System.out.println(s.contains("java is fun"));

ntimes("Hello All", 2);
doublex("Hellxxhello");
overxx("oopxxx");
int [] array= {1,2,3,4,5,6,9,9,9};
find9(array);
findYak("promiseyakpromise");
    }

    //Given a string and a non-negative int n return a larger string
    //that is n copies of the larger string.
    public static int ntimes(String str, int n) {
        String result = " ";
        for (int i=0; i< n; i++) {
            result = (result + str);
        }
        System.out.println(result);
        return n;
    }

    //Given a string, return true if the first instance of "x" in
    //the string is immediately followed by another "x"
    public static boolean doublex(String str) {
        int i = str.indexOf("x");
        if (i == -1)
            System.out.println(false);
        // Is char at i+1 also an "x"
        if (i+1 >= str.length()) System.out.println(false);
        System.out.println( str.substring(i+1, i+2).equals("x"));


        return false;
    }

    //Count the number of "xx" in the given string
    //We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
    public static String overxx(String str){
        int count = 0;
        for (int i = 0; i < str.length()-1; i++){
            if (str.substring(i, i+2).equals("xx")) count++;
        }
        System.out.println(count);

        return str;
    }

    //Given an array of ints, return the number of 9s in the array
    public static boolean find9(int [] nums){
        int count = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i] == 9){
                count++;
            }
        }
        System.out.println(count);


        return false;
    }

    //Suppose the string "yak" is unlucky. Given a string, return a version where all the
    //"yak" are removed
    //but the "a" can be any char. The "yak" strings will not overlap
    public static String findYak(String str){
        String result = "";

        for (int i=0; i<str.length(); i++){

            if (i+2<str.length() && str.charAt(i) == 'y' && str.charAt(i+2)=='k'){
                i= i +2;
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);

        return result;
    }

}
