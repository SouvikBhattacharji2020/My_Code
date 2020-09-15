import java.util.Scanner;
public class chp_7_no_12
{
public static void main (String args []) 
{
Scanner in = new Scanner(System.in);
System.out.print("Enter sum of money: ");
double sum = in.nextDouble();
System.out.print("Enter number of days: ");
int days = in.nextInt();
double interest = 0.0;
if (days <= 180)
interest = sum * 5.5 / 100.0;
else if (days <= 364)
interest = sum * 7.5 / 100.0;
else if (days == 365)
interest = sum * 9.0 / 100.0;
else
interest = sum * 8.5 / 100.0;
double amt = sum + interest;
System.out.print("Maturity Amount = " + amt);
}
}