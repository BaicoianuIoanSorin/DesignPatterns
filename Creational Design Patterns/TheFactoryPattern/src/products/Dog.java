package products;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark bark");
    }

    @Override
    public void moveAround() {
        System.out.println(getName() + " little dog is moving around!");
    }


}
