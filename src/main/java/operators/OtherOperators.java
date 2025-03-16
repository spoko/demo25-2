package operators;

public class OtherOperators {
    public static void main(String[] args) {
        int a = 34;
        int b = 5;

        System.out.println(a < b ? "a is smaller" : "a is greater");
        System.out.println(a == b ? "equals" : "not equals");

        double resultOfDivision = (double) a / b;
        System.out.println(resultOfDivision);

        if (a == b){
            System.out.println("Numbers are equal");
        }else if (a > b){
            System.out.println("A is greater");
        }else {
            System.out.println("B is greater");
        }

        printDayOfTheWeekWithIf(2);
        System.out.println("-----");
        printDayOfTheWeekWithSwitch(1);
        printDayOfTheWeekWithSwitch(21);

        System.out.println("-----");

        printDaysInTheMonth(2, 1984);
        printDaysInTheMonth(2, 2016);
        printDaysInTheMonth(2, 2003);
        printDaysInTheMonth(2, 2015);
        printDaysInTheMonth(2, 1900);
        printDaysInTheMonth(2, 2100);
        printDaysInTheMonth(2, 2000);

    }

    public static void printDayOfTheWeekWithIf(int day){
        if(day == 1){
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wed..");
        }
    }

    public static void printDayOfTheWeekWithSwitch(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Error: Invalid entry!");
        }
    }

    public static void printDaysInTheMonth(int month, int year){
        int numberOfDays = 0;

        switch (month){
            case 1:
                numberOfDays = 31;
                System.out.printf("Select month is January, it has %d\n", numberOfDays);
                break;
            case 2:
                if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
                    numberOfDays = 29;
                    System.out.printf("Select month is February, it has %d\n", numberOfDays);
                    break;
                }else {
                    numberOfDays = 28;
                    System.out.printf("Select month is February, it has %d\n", numberOfDays);
                    break;
                }
            default:
                System.out.println("Error: Invalid entry");
        }
    }
}
