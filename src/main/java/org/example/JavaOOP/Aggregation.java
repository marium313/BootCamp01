package org.example.JavaOOP;
/*
* if a class have an entity reference it is known as aggregation.
* Aggregation represents the HAS-A relationship between two classes.
*
* a class with attributes can become an attribute of another class..
*
 */
public class Aggregation {
    public static void main(String[] args){
Address address1 = new Address("123 Main Street", "New York","NY","111111");
Address address2 = new Address("456 Main Street","Cambridge","MA","123456");

Emp emp1 = new Emp(101,"John",address1);
Emp emp2 = new Emp(2,"Mary", address2);

emp1.displayInfo();
emp2.displayInfo();
    }
}
class Address {
    String street, city, state, zip;

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}

class Emp{
    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void displayInfo(){
        System.out.println("Id: " + id + " " + "Name: " + name);
        System.out.println("Address: " + address.street + " " + address.city + " " + address.state + " " + address.zip);

    }
}