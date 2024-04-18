package org.example.JavaOOP.VirtualPet;

abstract class PetSpecies {
    public String name;
    private int hunger;
    private int happiness;
    private int energy;

    public PetSpecies(String name, int hunger, int happiness, int energy) {
        this.name = name;
        this.hunger = hunger;
        this.happiness = happiness;
        this.energy = energy;
    }

    public void giveFood(int feed) {
        this.hunger -= feed;
        System.out.println(name + " " + feed);
        if (this.hunger <= 0) {
            System.out.println(name + " is hungry");
        }
    }

    public void playWith(int play) {
        this.happiness -= play;
        System.out.println(name + " " + play);
        if (this.happiness <= 0) {
            System.out.println(name + " is not happy");
        }
    }
    public void putSleep(int sleep) {
        this.energy -= sleep;
        System.out.println(name + " " + sleep);
        if (this.energy <= 0) {
            System.out.println(name + " is sleepy");
        }
    }
}