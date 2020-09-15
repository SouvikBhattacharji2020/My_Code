/*
Question 3
Write a program to input two unequal numbers. Display the numbers after swapping their values in the
variables without using a third variable.
Sample Input: a = 23, b = 56
Sample Output: a = 56, b = 23
*/


import java.util.*;

public class MyClass1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int m1=sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int m2=sc.nextInt();
        
        System.out.println("The value of a = "+m1);
        System.out.println("The value of b = "+m2);
        
        m2=m1+m2;   // 3+4=7
        m1=m2-m1;   // 7-3=4
        m2=m2-m1;   // 7-4=3
        
        System.out.println("Afert Swap the number without third variable :- \n ");
        System.out.println("The value of a = "+m1);
        System.out.println("The value of b = "+m2);
        
        
        
    }
}