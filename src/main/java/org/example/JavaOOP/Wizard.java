package org.example.JavaOOP;

class Wizard extends Warrior{
    public Wizard(String name){
        super(name,60);
    }
    @Override
    void attack(){
        System.out.println("Wizard " + name + " attacks!");
    }
    @Override
    void defend(){
        System.out.println("Wizard " + name + " defends!");
    }
}

