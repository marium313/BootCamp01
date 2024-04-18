package JavaCollection;
/*
*in java stack is a data structure that follows LIFO (last in first out) pattern. This means that the last element added to this pack
* will be the first one to be removed.
* java provides an implementation of stack with stack class.
* it has 1 based indexing. So if you delete the first element it will return -1.
*
*/

import java.util.Stack;

public class JavaStackExample {
    public static void main(String[] args) {
        String Original = "step on no pets";
        String reversed = reverseString(Original);

        System.out.println("Original String: " + Original);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}

