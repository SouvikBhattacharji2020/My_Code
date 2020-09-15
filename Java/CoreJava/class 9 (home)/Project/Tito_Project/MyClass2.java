/*
Question 4
Write a program to input three angles of a triangle and check whether a triangle is possible or not. If
possible, then check whether it is an acute-angled triangle, right-angled or an obtuse-angled triangle,
otherwise display “Triangle not possible”.
Sample inputs: Enter three angles: 40, 50, 90
Sample output: Right-angled triangle
*/

import java.util.*;

public class MyClass2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st Angle : ");
        int m1=sc.nextInt();
        System.out.print("Enter the 2nd Angle : ");
        int m2=sc.nextInt();
        System.out.print("Enter the 3nd Angle : ");
        int m3=sc.nextInt();
        
        if((m1+m2+m3)==180)
        {
         if(m1<90 && m2<90 && m3<90)
         {
             System.out.print("This is a acute triangle. ");
         }
         else if(m1==90 || m2==90 || m3==90)
         {
             System.out.print("This is a right triangle. ");
         }
         else
         {
             System.out.print("This is a obtuse triangle. ");
         }
        }
        else{
           System.out.print("This is not a triangle."); 
        }
        
    }
}