package org.example.JavaOOP.VirtualPet;


interface feed{
    void feed();
}
interface play{
    void play();
}
interface sleep {
    void sleep();

    class Pet implements feed,play,sleep{
        @Override
        public void feed() {
            System.out.println("Feeding");
        }

        @Override
        public void play() {
            System.out.println("Playing");
        }

        @Override
        public void sleep() {
            System.out.println("Sleeping");
        }
    }
}