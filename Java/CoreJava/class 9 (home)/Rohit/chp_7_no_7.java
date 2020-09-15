import java.util.Scanner;
public class chp_7_no_7
{
public static void main (String args [])
 {
Scanner in = new Scanner(System.in);
System.out.println("Enter 3 unequal numbers");
System.out.print("Enter first number: ");
int a = in.nextInt();
System.out.print("Enter second number: ");
int b = in.nextInt();
System.out.print("Enter third number: ");
int c = in.nextInt();
int sum = a + b + c;
int big = Math.max(a, b);
big = Math.max(big, c);
int small = Math.min(a, b);
small = Math.min(small, c);
int result = sum - big - small;
System.out.println("Second Smallest Number = " + result);
}
}