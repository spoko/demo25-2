package data.types;

public class Variables {

    public static void main(String[] args) {
        //all variables here are local
        //primitive types:
        byte age = 127;
        short shortExample = 30000;
        int intDemo = 324234234;
        long longDemo = 234523534534L;

        float floatDemo = 3.14f;
        double doubleDemo = 3.147658556;
        char someRandomChar = 'k';

        //referent types:
        String someString = "Hello world!";

        Dog frenchBulldog = new Dog();
        frenchBulldog.name = "Morti";
        frenchBulldog.age = 4;
        frenchBulldog.breed = "French Bulldog";
        Dog.tail = "short";

        System.out.println(age);

        System.out.println("French Bulldog Details:");
//        System.out.println(frenchBulldog.name);
//        System.out.println(frenchBulldog.age);
//        System.out.println(frenchBulldog.breed);
//        System.out.println(Dog.tail);//
        frenchBulldog.printDetails();

        System.out.println("Sharo Details:");
        Dog sharo = new Dog();
//        System.out.println(sharo.name);
//        System.out.println(sharo.age);
//        System.out.println(sharo.breed);
//        System.out.println(Dog.tail);
        sharo.printDetails();
        System.out.println(Dog.tail.charAt(3));
    }
}
