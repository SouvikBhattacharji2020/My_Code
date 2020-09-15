import java.util.Scanner;
public class chp_7_no_8
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
int min = a, max = a;
min = b < min ? b : min;
min = c < min ? c : min;
max = b > max ? b : max;
max = c > max ? c : max;
System.out.println("Greatest Number: " + max);
System.out.println("Smallest Number: " + min);
}
}