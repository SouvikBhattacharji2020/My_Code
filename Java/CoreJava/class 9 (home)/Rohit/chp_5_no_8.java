import java.util.Scanner;
public class chp_5_no_8
{
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.println("Enter two unequal numbers");
System.out.print("Enter first number: ");
int a = in.nextInt();
System.out.print("Enter second number: ");
int b = in.nextInt();
a = a + b;
b = a - b;
a = a - b;
System.out.println("a = " + a + " b = " + b);
}
}