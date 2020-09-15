/*
Question 11
Write a program to display all the buzz numbers between p and q where p < q. A buzz number is the
number which either ends with 7 or is divisible by 7.
*/

import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter value of starting range :");
      int p=sc.nextInt();
      System.out.println("Enter value of ending range :");
      int q=sc.nextInt();
      if(p<q){
          for(int i=p;i<=q;i++)
          {
              if(i%7==0 || i%10==7)
              {
                  System.out.print(i+", ");
              }
          }
      }
    }
}