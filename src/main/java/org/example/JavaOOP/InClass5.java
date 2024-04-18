package org.example.JavaOOP;

import java.util.Scanner;

public class InClass5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        char operator;

        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter the operator: ");
        operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();

        double result;

        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case'-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0){
                    result = num1 / num2;
                }else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                return;
        }
        System.out.println("Result: " + result);
    }
}
