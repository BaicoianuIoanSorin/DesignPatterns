package main;

import products.Animal;

public interface IAnimalFactory {
    public Animal createAnimal(String name, AnimalType animalType);
}
