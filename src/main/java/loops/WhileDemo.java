package loops;

public class WhileDemo {
    public static void main(String[] args) {
        printFactorial(0);
        printFactorial(1);
        printFactorial(5);

        int number = 10;
        while (number <= 20){
            System.out.printf("Current number is: %d\n", number);
            number++;
        }
    }

    public static void printFactorial(int n){
        int factorial = 1;
        int iterator = n;

        while (iterator > 0){
            factorial *= iterator;
            iterator--;
        }
        System.out.printf("You have entered: %d. Factorial is: %d.\n", n, factorial);
    }
}
