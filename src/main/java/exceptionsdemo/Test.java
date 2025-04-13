package exceptionsdemo;

import java.io.IOException;

public class Test {
    public static void main(String[] args)throws IOException, CustomException {
       try{
           FileReader.readFile("./src/main/resources/hello.txt");
       }catch (IOException e){
           System.out.println("Error: file is missing: " + e.getMessage());
       }
       finally {
           System.out.println("I will be always executed");
       }

       //FileReader.readFile("./src/main8/resources/hello.txt");
       System.out.println("final row of code");

       try {
           System.out.println( 5 / 0);
       } catch (ArithmeticException e){
           throw new CustomException(e.getMessage());
       }
    }
}
