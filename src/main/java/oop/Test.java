package oop;

public class Test {
    public static void main(String[] args) {
        Breed frBulldog = new Breed("French Bulldog",
                "Stomach issues, lower back issues",
                "Curvy nose, noisy, farts, short, stubborn");
        Address mortiAddres = new Address("Sofia", "507", 1236);
        Dog morti = new Dog("Morti", 5, frBulldog, mortiAddres);

        System.out.println(morti);

        morti.eats();
        morti.barks();

        Address catAddress = new Address("Sofia", "202", 1000);
        Breed persian = new Breed("Persian", "Blah", "Long hair");

        Cat lizy = new Cat("Lizy", 5, persian, catAddress);
        System.out.println(lizy);
    }
}