package oop;

public class Pet {
    //characteristics
    private String name;
    private int age;
    private Breed breed;//Composition
    private Address address;//Aggregation

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: Invalid entry for city!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0){
            this.age = age;
        }else {
            System.out.println("Error: Invalid entry for age!");
        }
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        if (!breed.equals(null)){
            this.breed = breed;
        } else {
            System.out.println("Error: Invalid entry for breed!");
        }

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        if (!address.equals(null)){
            this.address = address;
        } else {
            System.out.println("Error: Invalid entry for address!");
        }
    }

    //constructors
    public Pet(String name, int age, Breed breed, Address address){
        setName(name);
        setAge(age);
        setBreed(breed);
        setAddress(address);
    }

    //Actions i.e. methods
    public void eats(){
        System.out.printf("%s is eating...\n", name);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed=" + breed +
                ", address=" + address +
                '}';
    }
}
