package org.example.JavaOOP;

public class AbstractionExample2 {
    public static void main(String[] args){
        Warrior knight = new Knight("Lancer Loft");
        Warrior archer = new Archer("Robin hood");
        Warrior wizard = new Wizard("Wizard Gandalf");

        knight.attack();
        archer.attack();
        wizard.attack();

        knight.defend();
        archer.defend();
        wizard.defend();

        knight.takeDamage(10);
        archer.takeDamage(20);
        wizard.takeDamage(30);
    }
}
