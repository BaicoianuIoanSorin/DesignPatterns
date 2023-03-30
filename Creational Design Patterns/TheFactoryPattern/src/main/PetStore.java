package main;

import products.Animal;

public class PetStore {

    private IAnimalFactory factory;

    public PetStore(IAnimalFactory factory) {
    }
    public static void main(String[] args) {
        PetStore petStore = new PetStore(AnimalFactory.getInstance());
        Animal pet = petStore.orderPet("Dollar", AnimalType.DOG);
        pet.makeSound();
        pet.moveAround();
    }

    public Animal orderPet(String petName, AnimalType animalType) {
        return factory.createAnimal(petName, animalType);
    }
}