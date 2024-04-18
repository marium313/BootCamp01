package org.example.JavaOOP.VirtualPet;

public class Dog extends PetSpecies{
    private String color;

    public Dog(String name, int hunger, int happiness, int energy, String color) {
        super(name, hunger, happiness, energy);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
