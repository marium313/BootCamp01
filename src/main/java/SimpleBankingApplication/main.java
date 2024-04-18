package SimpleBankingApplication;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        BankClients gsu = new BankClients(10);

        Customer customer = new Customer("John",1000,123456789,1234 );
        Application application = new Application(customer);

        Customer customer2 = new Customer("Jane",3500,987654321,4321 );
        Application application2 = new Application(customer2);

        Customer customer3 = new Customer("Jerry",5000,543219876,3214 );
        Application application3 = new Application(customer3);

        gsu.addCustomers(customer2);
        gsu.addCustomers(customer3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my banking application!");
        System.out.println("Enter your Name");
        System.out.println("Enter your Balance");
        System.out.println("Enter your PIN");
        int pin = scanner.nextInt();

        if(pin == customer.getPin()){
            System.out.println("Pin is correct! Choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transfer");
            System.out.println("5. Any more transactions?");
            System.out.println("6. Quit");



            int option = scanner.nextInt();

            switch(option){
                case 1:
                    System.out.println("Enter the amount to be deposited:");
                    double depositAmount = scanner.nextDouble();
                    application.deposit(depositAmount);
                    break;

                case 2:
                    System.out.println("Enter the amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    application.withdraw(withdrawAmount, pin);
                    break;

                case 3:
                    System.out.println("Enter the pin to check balance:");
                    int checkBalancePin = scanner.nextInt();
                    application.checkBalance(checkBalancePin);
                    break;

                case 4:
                    System.out.println("Enter the amount to be deposited:");
                    double depositAmount2 = scanner.nextDouble();
                    application2.deposit(depositAmount2);
                    break;

                case 5:
                    System.out.println("Enter the amount to withdraw:");
                    double withdrawAmount2 = scanner.nextDouble();
                    application2.withdraw(withdrawAmount2, pin);
                    break;

                case 6:
                    System.out.println("Enter the pin to check balance:");
                    int checkBalancePin2 = scanner.nextInt();
                    application2.checkBalance(checkBalancePin2);
                    break;

                case 7:
                    System.out.println("Enter the amount to be deposited:");
                    double depositAmount3 = scanner.nextDouble();
                    application3.deposit(depositAmount3);
                    break;

                case 8:
                    System.out.println("Enter the amount to withdraw:");
                    double withdrawAmount3 = scanner.nextDouble();
                    application3.withdraw(withdrawAmount3, pin);
                    break;

                case 9:
                    System.out.println("Enter the pin to check balance:");
                    int checkBalancePin3 = scanner.nextInt();
                    application3.checkBalance(checkBalancePin3);
                    break;

                case 10:
                    System.out.println("Successfully logged out, see you soon!");
                    System.out.println();
                    break;


                default:
                    System.out.println("Invalid option!");
            }
        }else{
            System.out.println("Incorrect Pin!");
        }

    }
}
