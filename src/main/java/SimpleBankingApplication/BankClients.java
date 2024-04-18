package SimpleBankingApplication;

public class BankClients {
    private Customer[] customers;
    private int customerCount;

        public BankClients(int customerCapacity) {
        customers = new Customer[customerCapacity];
        customerCount = 0;
    }

    public void addCustomers(Customer customer) {
        if (customerCount < customers.length) {
            customers[customerCount] = customer;
            customerCount++;
        } else {
            System.out.println("Cannot add more customers, limit reached.");
        }
    }
}

