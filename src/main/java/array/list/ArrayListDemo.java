package array.list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Sofia");
        cities.add(0, "Varna");
        cities.add("Plovdiv");

        System.out.println(cities);

        System.out.println(cities.remove("Plovdiv"));

        System.out.println(cities);

        System.out.println(cities.indexOf("Sofia"));
    }
}
