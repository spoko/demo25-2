package array.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("BMW");
        cars.add(0,"Mercedes");
        cars.add("Audi");

        System.out.println("Cars before a sell: " + cars);

        cars.remove("Audi");
        cars.remove(0);

        System.out.println("Cars after sells: " + cars);
    }
}
