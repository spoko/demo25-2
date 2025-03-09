package firstdemo;

import java.util.Scanner;

public class FirstClassDemo {

    public static void main(String [] args){
        //prints in the console the text:
        System.out.println("Hello JAVA");

        //block of code
        {
            int a = 10;
            System.out.println(a);
        }

        System.out.println("----------------");

        System.out.println("Please enter your name:");

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();

        System.out.println("Please enter your age:");

        int useAge = scanner.nextInt();

        System.out.println("Nice to meet you " + userName +
                ", what a wonderful age " + useAge + "!!!");
    }
}

