import java.util.Scanner;
public class chp_7_no_18
{
public static void main (String args []) 
{
Scanner in = new Scanner(System.in);
System.out.println("1. Series");
System.out.println("2. Parallel");
System.out.print("Enter your choice: ");
int choice = in.nextInt();
boolean isChoiceValid = true;
System.out.print("Enter r1: ");
double r1 = in.nextDouble();
System.out.print("Enter r2: ");
double r2 = in.nextDouble();
double eqr = 0.0;
switch (choice)
 {
case 1:
eqr = r1 + r2;
break;
case 2:
eqr = (r1 * r2) / (r1 + r2);
break;
default:
isChoiceValid = false;
System.out.println("Incorrect choice");
break;
}
if (isChoiceValid)
System.out.println("Equivalent resistance = " + eqr);
}
}