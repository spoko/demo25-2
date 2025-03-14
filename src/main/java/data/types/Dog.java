package data.types;

public class Dog {
    //instance variables
    byte age;
    String name;
    String breed;
    //static/ class variable
    static String tail;

    public void printDetails(){
        System.out.printf("The name of the dog is %s, age is %d and breed is %s.\n",
                name, age, breed);
    }
}
