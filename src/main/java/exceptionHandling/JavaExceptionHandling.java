package exceptionHandling;

import java.util.Scanner;/*
* in java, exception handling is a process or a mechanism that will catch exceptions and will keep the code running.
* Generally, when we write the code and if it has exceptions or errors then the code will stop working and the application will crash.
* But with exception handling we have the power to catch the exception and still continue processing the code
* with this we can catch runtime and compile time exceptions.
*
* an exception is an event that disrupts the normal flow of the code of the application.
* for example if we have 10 step code and our code might fail at step 4-5 or something, then in normal situation the application will crash.
* but with the help of exception handling we can continue processing the code by throwing an exception.
*
* exception comes from class throwable.
*                                           Throwable
*                               exception                 Error
*                               IO exception              StackOverFlowError
*                               SQL exception             VirtualMachineError
*                               ClassNotFoundException    OutOfMemoryError
*                               RuntimeException
*                                      ArithmeticException
*                                      NullPointException
*                                      NumberFormatException
*                                      IndexOutOfBoundException
*                                               ArrayIndexOutOfBoundException
*                                               StringIndexOutOfBoundException
*
*
* Types of exception in JAVA
* 1> Checked exception -- the class that directly inherits the throwable class except RuntimeException and error
*                         for eg: IOException, SQLException
*
* 2> Unchecked exception -- the class that inherits the runtime exception are known as Unchecked exceptions.
*                           for eg: ArithmeticException, NullPointException, ArrayIndexOutOfBoundException
*                           Unchecked exceptions are not checked at compile time but at runtime.
*
* 3> Error -- Error is irrecoverable. Some examples are OutOfMemoryError, VirtualMachineError, AssertionError...
*
* Keywords used in exceptions
* try
* catch
* finally
* throw
* throws
*
 */
public class JavaExceptionHandling {

    public static void main(String[] args) {
        d(10, 0);
        string();
        numberFormat();
        checkAge();
        checkPassword();
        find7th();

        try{
            checkNumber(-5);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static void d(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("This is code");
    }

    public static void string(){
        try{
            String s = null;
            System.out.println(s.length());
        }catch  (ArithmeticException e){
            System.out.println("arithmetic exception" + e.getMessage());
        }catch(NullPointerException e){
            System.out.println("NullPointerException" + e.getMessage());
        }
    }

    public static void numberFormat(){
        try{
            String str = "Hello Java";
            int num = Integer.parseInt(str);
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        try {
            int age = scanner.nextInt();
            if (age < 0) {
                throw new IllegalArgumentException("Age can not be negative");
            } else if (age >= 18) {
                System.out.println("you are eligible to vote");
            } else {
                System.out.println("Not eligible to vote yet");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, please try again");
        }finally{
            scanner.close();
        }
        scanner.close();
    }

    public static void find7th(){
    int[] arr = {1,2,3,4,5};
    try{
        int seventh = arr[7];
        System.out.println(seventh);
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println(e.getMessage());
    }
    }

   public static void checkPassword(){
    Scanner scanner = new Scanner (System.in);
       System.out.println("Enter Password: ");
       try{
           String password = scanner.next();
           if(password.matches(".*[A-Z].*") && password.matches(".*//d.*")){
               System.out.println("Password is valid");
           }else{
               System.out.println("Password is not valid");
           }
       }catch (NumberFormatException e){
           System.out.println("Invalid input, please try again");
       }
       scanner.close();
    }

    public static void checkNumber(int number)throws IllegalArgumentException{
        if(number < 0){
            throw new IllegalArgumentException("Number cannot be negative");
        }else{
            System.out.println("number is : " + number);
        }
    }
}


// write a program that prompts user to input age and check if the user is eligible to vote or not. Check for neg int and non-numeric values.

//given an array of 5 numbers find me the 7th number of the array.

// write a program that prompts user to input string password and check if it has capital letter and a number.
//-- ".*[A-Z].*" regex for capital characters
//-- ".*//d.* regex for numbers





