package operators;

public class ArithmeticalOperations {
    public static void main(String[] args) {
        int firstNumber = 13;
        int secondNumber = 5;

        System.out.println(firstNumber % secondNumber);//3

        System.out.println("Increments:");
        System.out.println(++firstNumber);//14
        System.out.println(firstNumber);//14

        System.out.println(secondNumber++);//5
        System.out.println(secondNumber);//6

        System.out.println("Decrements:");
        System.out.println(--firstNumber);//13
        System.out.println(firstNumber);//13

        System.out.println(secondNumber--);//6
        System.out.println(secondNumber);//5
    }
}
