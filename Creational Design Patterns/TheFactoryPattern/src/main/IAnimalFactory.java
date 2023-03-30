package main;

import products.Animal;

public interface AnimalFactory {
    public Animal createAnimal(String name, AnimalType animalType);
}
