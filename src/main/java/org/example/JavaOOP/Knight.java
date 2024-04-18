package org.example.JavaOOP;

class Knight extends Warrior {

public Knight(String name){
    super(name,100);
}
@Override
    void attack(){
    System.out.println("Knight " + name + " attacks");
}
@Override
    void defend(){
    System.out.println("Knight " + name + " defends");
}
}
