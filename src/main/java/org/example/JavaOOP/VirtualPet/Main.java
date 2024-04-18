package org.example.JavaOOP.VirtualPet;


import org.example.JavaOOP.VirtualPet.sleep.Pet;

public class Main {
    public static void main(String[] args){
        PetShelter gsu = new PetShelter(10);

        feed feed1 = new Pet();
        System.out.println("Feeding the virtual pet");

        play play1 = new Pet();
        System.out.println("Playing with the virtual pet");

        sleep sleep1 = new Pet();
        System.out.println("Putting virtual pet to sleep");

        Dog dog1 = new Dog("Skipper",20,80,75,"brown");
        Cat cat1 = new Cat("Isabelle",15,30,36,4);
        Bird bird1 = new Bird("Paul",55,72,94,1);

        PetSpecies Dog = new Dog("Skipper",40,35,10,"brown");
        PetSpecies Cat = new Cat("Isabelle",30,45,20,4);
        PetSpecies Bird = new Bird("Paul",3,55,30,1);

        Dog.giveFood(40);
        Cat.giveFood(30);
        Bird.giveFood(3);

        Dog.playWith(35);
        Cat.playWith(45);
        Bird.playWith(55);

        Dog.putSleep(10);
        Cat.putSleep(20);
        Bird.putSleep(30);

//        gsu.displayAllPets();
    }
}
