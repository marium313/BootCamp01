package org.example.JavaOOP;

abstract class Warrior {
    public String name;
    private int health;

    public Warrior(String name, int health){
        this.name = name;
        this.health = health;
    }
    abstract void attack();
    abstract void defend();

    public void takeDamage(int damage){
        this.health -= damage;
        System.out.println(name + " " + damage);
        if (this.health <= 0){
            System.out.println(name + " is dead");
        }
    }
}
