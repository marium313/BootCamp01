package org.example.JavaOOP.VirtualPet;

public class Cat extends PetSpecies {
    private int paws;

    public Cat(String name, int hunger, int happiness, int energy, int paws) {
        super(name, hunger, happiness, energy);
        this.paws = paws;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }
}
