/*
Operators ?
Operators are used to perform operation(addition,subtraction, comparison) b/w variables and values.
5 Types of operators in JAVA.
1. Arithmetic (=,-,*,/,%,++,--)
2. Assignment (=,+=)
3. Comparison (==,>=, <=)
4. Logical    (&&,||, !)
5. BitWise    (&,!)

 */

public class Tut08_OperatorsAndTypeOfOperators {
    public static void main(String[] args){
        int num1=2;
        int num2=3;
        int sum= num1+num2;

        System.out.println("Sum :- " + sum);

//        a++ :- First we use value then increment value
//        ++a :- First increment then use the value

//        int num3=num1++;
//        System.out.println("Expected output are 2:"+num3);

        int num4=++num1;
        System.out.println("Expected output are 3:"+num4);


    }
}
