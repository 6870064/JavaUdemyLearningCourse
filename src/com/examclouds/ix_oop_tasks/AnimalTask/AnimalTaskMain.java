package com.examclouds.ix_oop_tasks.AnimalTask;

import com.examclouds.ix_oop_tasks.AnimalTask.enums.Location;

public class AnimalTaskMain {
    public static void main(String[] args) {

        Veterinarian veterinarian = new Veterinarian("Ivanov, Petr", Location.MINSK);
        Veterinarian veterinarian1 = new Veterinarian("Sidorov, Maxim", Location.GOMEL);
        Veterinarian veterinarian2 = new Veterinarian("Strelcova, Alina", Location.BREST);
        Veterinarian veterinarian3 = new Veterinarian("Dosaeva, Kseniya", Location.VITEBSK);
        Veterinarian veterinarian4 = new Veterinarian("Aksimova, Olga", Location.MINSK);

        Animal animal = new Cat("Bella", "Proplan", Location.MINSK, 5);
        Animal animal1 = new Cat("Cloudlet", "Mongue Premium", Location.MINSK, 5);
        Animal animal2 = new Cat("Kitten", "Mongue sterilized", Location.BREST, 2);
        Animal animal3 = new Dog("Barkly", "Meat", Location.GOMEL, "Shepherd dog");
        Animal animal4 = new Dog("Colline", "Meat", Location.MINSK, "Shepherd dog");
        Animal animal5 = new Horse("Blacky", "Food", Location.GRODNO, 130);

        Animal[] animals = {animal, animal1, animal2, animal3, animal4, animal5};
        Veterinarian[] veterinarians = {veterinarian, veterinarian1,veterinarian2, veterinarian3, veterinarian4};
        veterinarian.treatAnimal(animal5);
        veterinarian.treatAnimal(animal1);
        veterinarian1.treatAnimal(animal4);

        printAnimals(animals);
        printVeterinarians(veterinarians);


    }

    public static void printAnimals(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
    }

    public static void printVeterinarians(Veterinarian[] veterinarians) {
        for (int i = 0; i < veterinarians.length; i++) {
            System.out.println(veterinarians[i]);
        }
    }
}
