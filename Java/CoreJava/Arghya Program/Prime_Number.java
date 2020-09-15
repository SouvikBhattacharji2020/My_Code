import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number :-");
     int a=sc.nextInt();
     int m=0;
      for(int i=1;i<=a;i++)
      {
          if(a%i==0)
          {
             m++;
             System.out.print(i+"  ");
          }
      }
      System.out.println();
         if(m==2){
             System.out.println("This is a Prime Number.");
            }
        else{
           System.out.println("This is a Not Prime Number."); 
        }
    }
}