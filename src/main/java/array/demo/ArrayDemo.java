package array.demo;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] numbers = {78, 55, 6, 65, 6};
        String [] cities = {"Sofia", "Plovdiv", "Burgas", "Varna"};

        //System.out.println(numbers);
        printElements(numbers);
        //System.out.println(cities);
        printElements(cities);
    }

    public static void printElements(int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.printf("Current index is: %d. Element is: %d.\n", i, array[i]);
        }
    }

    public static void printElements(String [] array){
        for(String city : array){
            System.out.printf("Current city is: %s.\n", city);
        }
    }
}
