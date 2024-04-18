package org.example.JavaOOP;

// create a java class to represent a simple inventory management system..
// the inventory should contain products and each product should have a name, price, quantity, and availability.
// add products to the inventory
// if purchase of the product should be done by the customer, the inventory changes.
// if purchase of the product should be done by the shop, the inventory changes.
// display the products in the inventory for the end of the day.

class Product {
    private String name;
    private double price;
    private int quantity;
    private boolean availability;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.availability = true;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void updateQuantity(int delta) {
        if (quantity <= 0) {
            availability = false;
            availability = false;
        } else {
            availability = true;
        }
    }
}

class Inventory{
    private Product[] products;
    private int size;
    private static final int DEFAULT_CAPACITY = 100;

    // Constructor
    public Inventory(){
        this.products = new Product[DEFAULT_CAPACITY];
        this.size = 0;
    }


    public void addProduct(Product product){
        if (size < products.length){
            products[size++] = product;
        } else {
            System.out.println("Inventory is full. Cannot add more products.");
        }
    }

    public void removeProduct(Product product){
        int index = -1;
        for (int i = 0; i < size; i++){
            if(products[i] == product){
                index = i;
                break;
            }
        }

        if (index != -1){
            for (int i = index; i < size - 1; i++){
                products[i] = products[i + 1];
            }
            products[size - 1] = null;
            size--;
        } else{
            System.out.println("Product not found in inventory.");
        }
    }
    public void updateQuantity(Product product, int delta){
        product.updateQuantity(delta);
    }

    public void displayAvailableProducts(){
        System.out.println("Available Products:");
        for (int i = 0; i < size; i++){
            Product product = products[i];
            if (product.isAvailability()){
                System.out.println(product.getName() + " - Price: $" + product.getPrice() + ", Quantity: " + product.getQuantity());
            }
        }
    }

    public static void main(String[] args){
        //Create an inventory instance
        Inventory inventory = new Inventory();

        //Add products to the inventory
        inventory.addProduct(new Product("Rose",9.99,50));
        inventory.addProduct(new Product("Lily",19.99,25));
        inventory.addProduct(new Product("Bouquet",29.99,25));

        //Display available products
        inventory.displayAvailableProducts();

        //update quantity of a product when sold
        Product RoseToUpdate = inventory.products[0];
        Product LilyToUpdate = inventory.products[1];
        Product BouquetToUpdate = inventory.products[2];

        inventory.updateQuantity(RoseToUpdate,-2);
        inventory.updateQuantity(RoseToUpdate,10);

        //Display available products after updating quantity
        inventory.displayAvailableProducts();
    }
}


