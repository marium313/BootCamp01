package SimpleBankingApplication;

public class Application {
    public Customer customer;

    public Application(Customer customer) {
        this.customer = customer;
    }

    //deposit
    public void deposit(double amount) {
        customer.setBalance(customer.getBalance() + amount);
        System.out.println("Deposit successful! New Balance" + customer.getBalance());
    }

    public void withdraw(double amount, int pin) {
        if (pin == customer.getPin()) {
            if (customer.getBalance() >= amount) {
                customer.setBalance(customer.getBalance() - amount);
                System.out.println("Withdraw successful! New Balance" + customer.getBalance());
            } else {
                System.out.println("Insufficient Balance!");
            }
        } else {
            System.out.println("Incorrect Pin!");
        }
    }

    public void checkBalance(int pin){
        if(pin == customer.getPin()){
            System.out.println("Current balance is: " + customer.getBalance());
        }else{
            System.out.println("Incorrect Pin!");
        }

//        public void transfer(double amount, int pin){
//            if(customer.getBalance() >= amount) {
//                customer.getBalance() += amount;
//                customer.getBalance() -= amount;
//                System.out.println("Transaction Successful");
//            }
//            else {
//                System.out.println("Insufficient Funds!");
            }
        }



/*
* what are the flows of the application?
* how can we solve it to add more use cases?
*
* there is only one customer..
* there is no transfer method if I have multiple customer.
* application exit after every transaction
* check for inputs
* flow of the code
* switch statement in a method
* add exit case
* on deposit there is no - int check
* the scanner is not closed.
*
*
* // create a customer
* // select a customer
* // pin for the customer
* // deposit, withdraw, check balance, transfer between customers.
* // ask again if want to do any more transactions.
* // if not then there should be an option to exit the application.
 */
