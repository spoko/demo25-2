package operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        boolean result = false;

        System.out.println(!result);//true

        result = (firstNumber < secondNumber) && !(firstNumber > secondNumber);
        System.out.println(result);//true

        result = (firstNumber < secondNumber) && (firstNumber > secondNumber);
        System.out.println(result);//false

        result = (firstNumber > secondNumber) || !(firstNumber < secondNumber);
        System.out.println(result);//false

        result = (firstNumber < secondNumber) || (firstNumber < secondNumber);
        System.out.println(result);//true
    }
}
