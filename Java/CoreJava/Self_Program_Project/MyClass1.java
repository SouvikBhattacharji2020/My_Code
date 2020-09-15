/*
WAP to input a number and findout thether the number is divided by 7 or the last digit is 7.
*/


import java.util.*;

public class MyClass1 {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number :-");
      int x=sc.nextInt();
      if(x%10==7 || x%7==0)
      {
          System.out.println("The number is Funny Number.");
      }
      else{
          System.out.println("The number is Not Funny Number.");
      }
    }
}