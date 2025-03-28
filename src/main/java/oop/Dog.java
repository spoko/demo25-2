package oop;

public class Dog extends Pet {


    public Dog(String name, int age, Breed breed, Address address) {
        super(name, age, breed, address);
    }

    //we can override only inherited methods
    @Override
    public void speaks() {
        barks();
    }

    public void barks(){
        System.out.printf("%s is barking...\n", getName());
    }

    //method overloading
    public void barks(boolean isItLoud){
        if (isItLoud){
            System.out.printf("%s is barking loudly!\n", getName());
        }else {
            barks();
        }
    }

    public void barks(String how){
        System.out.printf("%s is barking %s!\n", getName(), how);
    }
}
