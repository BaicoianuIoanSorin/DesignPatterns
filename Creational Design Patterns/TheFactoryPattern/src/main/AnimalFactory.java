package main;

import products.Animal;
import products.Cat;
import products.Dog;

public class AnimalFactory implements IAnimalFactory {

    private static AnimalFactory instance;

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

    public static AnimalFactory getInstance() {
        if(instance == null) {
            instance = new AnimalFactory();
        }
        return instance;
    }
}
