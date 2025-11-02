import java.util.Scanner;

public class Tut05_TakingInputsFromUser{
    public static void main(String[] args){
//  Scanner Class from util package  and create a object to take the user input
        Scanner sc= new Scanner(System.in);

        System.out.println("Can I know your good name ?");
        String name=sc.nextLine(); // nextLine() help us to take input as full sentences including spaces. otherwise nextInt(), nextFloat() picked only the first word.
        System.out.println("Nice to meet you,"+name +" your location is  ?");
        String fullAddress=sc.nextLine();
        System.out.println(fullAddress);

        System.out.println("Here we are taking 3 number and sum that numbers(int,decimal,float)");
        System.out.println("Enter First Number ");
        int num1=sc.nextInt();
        System.out.println("Enter the Second Number");
        int num2=sc.nextInt();
        System.out.println("Enter the Third Number");
        float num3=sc.nextFloat();
        System.out.println("Sum are :-");
        float sum=num1+num2+num3;
        System.out.println(sum);





    }
}