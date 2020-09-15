import java.util.*;
public class chp_7_no_3
{
public static void main (String args [])
 {
Scanner in = new Scanner(System.in);
System.out.print("Enter first number: ");
int a = in.nextInt();
System.out.print("Enter second number: ");
int b = in.nextInt();
System.out.print("Enter third number: ");
int c = in.nextInt();
if (a == b && b == c) 
{
System.out.println("All the numbers are equal");
}
else {
int g = a;
if (b > g)
g = b;
if (c > g)
g = c;
System.out.println("Greatest number: " + g);
}
}
}