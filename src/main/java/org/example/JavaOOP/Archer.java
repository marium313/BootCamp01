package org.example.JavaOOP;

class Archer extends Warrior {
    public Archer(String name){
        super(name,80);
    }
    @Override
    void attack(){
        System.out.println("Archer " + name + " attacks");
    }
    @Override
    void defend(){
        System.out.println("Archer " + name + " defends");
    }
}

