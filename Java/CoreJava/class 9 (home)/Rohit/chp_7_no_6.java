import java.util.Scanner;
public class chp_7_no_6
{
public static void main (String args [])
 {
Scanner in = new Scanner(System.in);
System.out.print("Enter first number: ");
int a = in.nextInt();
System.out.print("Enter second number: ");
int b = in.nextInt();
if (a < 0 || b < 0) {
System.out.println("Square root of a negative number can't be determined");
}
else 
{
double sqrtA = Math.sqrt(a);
double sqrtB = Math.sqrt(b);
boolean isAPerfectSq = sqrtA - Math.floor(sqrtA) == 0;
boolean isBPerfectSq = sqrtB - Math.floor(sqrtB) == 0;
if (isAPerfectSq && isBPerfectSq)
 {
System.out.println("They are perfect square numbers.");
}
else if (isAPerfectSq) 
{
System.out.println(a + " is a perfect square number.");
System.out.println(b + " is not a perfect square number.");
}
else if (isBPerfectSq)
 {
System.out.println(a + " is not a perfect square number.");
System.out.println(b + " is a perfect square number.");
}
else 
{
System.out.println("Both are not perfect square numbers.");
}
}
}
}