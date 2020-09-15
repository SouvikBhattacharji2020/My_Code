/*
Question 1 [13 + 2 = 15]
a) Using a switch case statement, write a menu-driven program to convert a given temperature from
Fahrenheit to Celsius and vice-versa. For an incorrect choice, an appropriate message should be displayed.
b) Give the variable list for the above program.
*/

import java.util.*;

public class MyClass7 {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the temp :");
     double a=sc.nextDouble();
     System.out.println("You want to convert into celsius from fahrenheit then press 1 / fahrenheit from celsius then press 2 :");
     int b=sc.nextInt();
     switch(b)
     {
         case 1:
             double c=((a-32.0)/9.0)*5.0;
             System.out.println("The converted temperature is :"+c);
             break;
         case 2:
              double f=(a*9.0/5.0)+32.0;
             System.out.println("The converted temperature is :"+f);
             break;
         default:
            System.out.println("The given data is not valid.");
     }
     
    }
}

/*
veriable listing : -
Name    |    Data Type      |   Description    |
a       |    Double         | This is a variable a to take input as a Double number from user
b       |    Int            | This is a variable b to take input as a integer number from user
c       |    Double         | This is a variable c to convert temperature in Celsius
f       |    Double         | This is a variable f to convert temperature in Fahrenheit
*/