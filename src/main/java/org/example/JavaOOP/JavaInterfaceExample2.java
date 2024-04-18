package org.example.JavaOOP;

public class JavaInterfaceExample2 {
    public static void main(String[] args){
        Printer printer = new Printer();
        printer.print();
        printer.scan();

    }
}
interface Print{
    void print();
}
interface scan{
    void scan();
}
//Example of multiple inheritance by interface. here are two parents. print and scan.
class Printer implements Print,scan{
    @Override
    public void print(){
        System.out.println("Printing");
    }
    @Override
    public void scan(){
        System.out.println("Scanning");
    }
}