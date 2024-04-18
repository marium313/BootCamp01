package org.example.JavaOOP.VirtualPet;

public class Bird extends PetSpecies {
    private int beak;

    public Bird(String name, int hunger, int happiness, int energy, int beak) {
        super(name, hunger, happiness, energy);
        this.beak = beak;
    }

    public int getBeak() {
        return beak;
    }

    public void setBeak(int beak) {
        this.beak = beak;
    }
}
