// Exercise :- Write a  program to calculate the percentage of a given student in  CBSE board Exam. His marks from 5 subjects must be taken as input from user(keyboard). Marks are out of 100

import java.util.Scanner;

public class Tut06_Exercise01 {
    public static void main(String[] args){
        System.out.println("Calculate the given student percentage. Each subject marks out of 100");
        System.out.println("Student Name ?");
        Scanner userInput=new Scanner(System.in);
        String studentName=userInput.nextLine();
        System.out.println("Enter Subject 1 Marks");
        double subject1=userInput.nextDouble();
        System.out.println("Enter Subject 2 Marks");
        double subject2=userInput.nextDouble();
        System.out.println("Enter Subject 3 Marks");
        double subject3=userInput.nextDouble();
        System.out.println("Enter Subject 4 Marks");
        double subject4=userInput.nextDouble();
        System.out.println("Enter Subject 5 Marks");
        double subject5=userInput.nextDouble();


        double totalObtainedMarks=subject1+subject2+subject3+subject4+subject5;
        System.out.println(totalObtainedMarks/500);
        double calculatedPercentage=(totalObtainedMarks/500)*100;
        System.out.println(calculatedPercentage);
        System.out.println(studentName + " Percentage is :- " + calculatedPercentage+"%");
        System.out.println(studentName + " Percentage is :- " + String.format("%.2f",calculatedPercentage) +"%");  // To format the percentage to two decimal places




    }
}