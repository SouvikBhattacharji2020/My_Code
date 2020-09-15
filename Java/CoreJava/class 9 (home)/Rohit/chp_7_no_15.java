import java.util.Scanner;
public class chp_7_no_15
{
public static void main (String args [])
{
Scanner in = new Scanner(System.in);
System.out.println("Type 1 to convert from Fahrenheit to Celsius");
System.out.println("Type 2 to convert from Celsius to Fahrenheit");
int choice = in.nextInt();
double ft = 0.0, ct = 0.0;
switch (choice) 
{
case 1:
System.out.print("Enter temperature in Fahrenheit: ");
ft = in.nextDouble();
ct = 5 / 9.0 * (ft - 32);
System.out.println("Temperature in Celsius: " + ct);
break;
case 2:
System.out.print("Enter temperature in Celsius: ");
ct = in.nextDouble();
ft = 1.8 * ct + 32;
System.out.println("Temperature in Fahrenheit: " + ft);
break;
default:
System.out.println("Incorrect Choice");
break;
}
}
}