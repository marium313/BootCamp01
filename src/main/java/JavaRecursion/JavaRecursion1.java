package JavaRecursion;
/*
* Recursion in Java is a process in which a method calls itself continuously. A method in java
* which calls itself is called a recursive method.
*
 */
public class JavaRecursion1 {
    public static void main(String[] args) {
        RecursiveMethod r = new RecursiveMethod();
//        r.a();
        r.factorial(5);
        System.out.println("factorial: " + r.factorial(5));

        int n = 10;
        r.printFibonacci(n);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = r.arraySum(arr,0);
        System.out.println("The sum of the number of the array is: " + sum);

        int count = 20;
        System.out.println("series upto " + count + " is: ");
        r.printSeries(count);
        RecursiveMethod.printSeries(count);

    }
}
    class RecursiveMethod {
        static int count = 0;

        static void a() {
            count++;
            if (count <= 10) {
                System.out.println("Number: " + count);
                a();
            }
        }

        // factorial method
        int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }


        public static int fibonacci(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }


        public static void printFibonacci(int n) {
            for (int i = 0; i <= n; i++) {
                System.out.println(fibonacci(i) + " ");

            }
        }

        public static int arraySum(int[] arr, int index) {
            if (index == arr.length) {
                return 0;
            } else {
                return arr[index] + arraySum(arr, index + 1);
            }
        }

        // write a code that calculates the nth term of the series where
        // series 1,3,6,10,15,21;

        public static int series(int n) {
            if (n ==1){
                return 1;
            }else{
                return series(n-1) + n;
            }

        }

        public static void printSeries(int n){
            for(int i=1; i <= n; i++){
                System.out.print(series(i) + " ");
            }
        }
    }



