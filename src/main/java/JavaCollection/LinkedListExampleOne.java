package JavaCollection;

import java.util.LinkedList;
import java.util.Collections;


public class LinkedListExampleOne {
    public static void main(String[] args) {
//LinkedListExample();
reverseArray();


    }

    public static void LinkedListExample() {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Hello");
        ll.add("World");
        ll.addFirst("My World");
        ll.addLast("amazing world");
        System.out.println(ll.peekFirst());
        System.out.println(ll.pop());

        System.out.println(ll);
    }


    public static void reverseArray() {


        int[] ar = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original Array: ");
        for(int i = 0; i < ar.length; i++){
            System.out.println(ar[i] + " ");
        }

        LinkedList<Integer> LinkL = new LinkedList<Integer>();

        // add the elements of array in LinkedList
        for(int num : ar){
            LinkL.add(num);
        }

        //reverse the list
        Collections.reverse(LinkL);

        //add back to array
        int index = 0;
        for(int num : LinkL){
            ar[index++] = num;
        }

        //print the reversed
        System.out.println();
        System.out.println("reversed Array: ");
        for(int num : ar){
            System.out.println(num + " ");
        }
    }
}