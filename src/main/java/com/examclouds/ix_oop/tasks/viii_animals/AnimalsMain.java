package com.examclouds.ix_oop.tasks.viii_animals;

public class AnimalsMain {
    public static void main(String[] args) {
        Dog myDog = new Dog("Mongue", Location.MINSK, 5);
        Dog myDog1 = new Dog("Food", Location.VITEBSK, 4);
        Cat myCat = new Cat("Mongue", Location.GOMEL, "Beladonna");
        Cat myCat1 = new Cat("ProPlan", Location.GRODNO, "Kitty");
        Cat myCat2 = new Cat("Premie", Location.MINSK, "Pie");
        Horse horse = new Horse("Horse", Location.BREST, 240);

        Animal[] animalsArray = {myDog, myDog1, myCat, myCat1, myCat2, horse};
        Animal.printAnimals(animalsArray);
        Animal.VetAppointment(animalsArray);
    }
}
