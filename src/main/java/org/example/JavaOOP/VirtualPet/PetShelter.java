package org.example.JavaOOP.VirtualPet;
import org.example.JavaOOP.VirtualPet.sleep.Pet;

public class PetShelter {
    private Pet[] pets;
    private int petCount;

    public PetShelter(int petCapacity) {
        pets = new Pet[petCapacity];
        petCount = 0;
    }

    public void addPets(Pet pet) {
        if (petCount < pets.length) {
            pets[petCount] = pet;
            petCount++;
        } else {
            System.out.println("Cannot add more pets, limit reached.");
        }
    }
}

//    public void displayAllPets() {
//        System.out.println("All pets:");
//        for (int i = 0; i < petCount; i++)
//            System.out.println("Name: " + pets[i].feed() + ", hunger level" + pets[i].play() + ", happiness" + pets[i].sleep() + ", energetic");
//    }
//}
