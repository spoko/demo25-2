package oop;

public class Cat extends Pet {
    public Cat(String name, int age, Breed breed, Address address) {
        super(name, age, breed, address);
    }

    public void meow(){
        System.out.printf("%s is meowing...\n", getName());
    }
}
