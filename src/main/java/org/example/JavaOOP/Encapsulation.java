package org.example.JavaOOP;
/*
*In java, encapsulation is a process of wrapping the code and data into a single unit.
* we can create a fully encapsulated class in java by making all the data members of the class private.
*
* by providing only getter and setter method we can make the class read or write only.
* by this it provides you the control over the data.
* encapsulated class is best for unit testing.
*
*
 */
public class Encapsulation {
    public static void main(String[] args){
        BankAccount account = new BankAccount(123456789,"John Doe",1000.00);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Name: " + account.getAccountName());
        System.out.println("Balance: " + account.getBalance());

        // make some deposit
        account.deposit(500.00);
        System.out.println("Updated balance: " + account.getBalance());

        //make some withdrawal
        account.withdraw(200.00);
        System.out.println("Updated balance: " + account.getBalance());

        //ask for more than balance
        account.withdraw(1000000000000.00);
        System.out.println("Updated balance: " + account.getBalance());

    }
}

class BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;

    public BankAccount(int accountNumber, String accountName, double balance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println(amount + " has been deposited");
        }else {
            System.out.println("Amount must be positive / Invalid Amount");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(amount + " has been withdrawn");
        }else {
            System.out.println("Insufficient funds");
        }
    }
}
