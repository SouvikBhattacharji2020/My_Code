/*
Find out (a^2+2ab+b^2) in java
*/
import java.util.*;

public class Java_Program2 {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of 'a' :");
     int a=sc.nextInt();
     System.out.println("Enter the value of 'b' :");
     int b=sc.nextInt();
     double result=(Math.pow(a,2))+2*a*b+(Math.pow(b,2));
     System.out.println("The result is "+result);
     
      
    }
}

/*
Result:
Enter the value of 'a' :
10
Enter the value of 'b' :
30
The result is 4161600.0
*/