import java.util.Scanner;
public class chp_7_no_19
{
public static void main (String args [])
{
Scanner in = new Scanner(System.in);
System.out.print("Enter the sum: ");
double p = in.nextDouble();
System.out.print("Enter rate: ");
double r = in.nextDouble();
System.out.print("Enter time: ");
int t = in.nextInt();
System.out.println("Enter type of Interest");
System.out.print("('S'- Simple Interest 'C'- Compound Interest): ");
char type = in.next().charAt(0);
boolean isTypeValid = true;
double interest = 0.0;
switch (type) 
{
case 'S':
interest = p * r * t / 100;
break;
case 'C':
interest = p * (Math.pow((1 + (r / 100)), t) - 1);
break;
default:
isTypeValid = false;
System.out.println("Incorrect Interest type");
break;
}
if (isTypeValid) 
{
double amt = p + interest;
System.out.println("Sum = " + p);
System.out.println("Interest = " + interest);
System.out.println("Sum + Interest = " + amt);
}
}
}