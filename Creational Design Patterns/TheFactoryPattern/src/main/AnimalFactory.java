package main;

import products.Animal;
import products.Cat;
import products.Dog;

public class PetStoreFactory implements AnimalFactory {

    @Override
    public Animal createAnimal(String name, AnimalType animalType) {
        switch (animalType) {
            case CAT -> {
                return new Cat(name);
            }
            case DOG -> {
                return new Dog(name);
            }
            default -> throw new IllegalArgumentException("This type of animal doesn't exist.");
        }
    }
}
