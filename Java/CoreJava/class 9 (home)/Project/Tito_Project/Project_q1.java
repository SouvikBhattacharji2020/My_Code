// Question 1
// Write a program to input any two integers and find and display the greater integer using
// conditional/ternary operator.

import java.util.*;
class Project_q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b=sc.nextInt();
        
        int m=(a<b)?a:b;
        System.out.println(m);   


    }
}