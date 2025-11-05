//check the given number is integer or not ?

import java.util.Scanner;
public class Tut07_Exercise02 {
    public static void main(String[] args){
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter a number to check if is Integer or not... ?");
        String inputString=userInput.nextLine();
      try{
          Integer.parseInt(inputString);
            System.out.println("Given Input '"+inputString+ "' is Integer.");
      }catch(NumberFormatException e){
          System.out.println("Given number '"+inputString+ "' is not Integer, Reason is "+e);
        }
        userInput.close();


    }
}