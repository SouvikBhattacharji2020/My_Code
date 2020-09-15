import java.util.Scanner;
public class chp_7_no_4
{
public static void main (String args []) 
{
Scanner in = new Scanner(System.in);
System.out.print("Enter number: ");
int num = in.nextInt();
if (num % 3 == 0 && num % 5 == 0)
System.out.println("Divisible by 3 and 5");
else if (num % 3 == 0)
System.out.println("Divisible by 3 but not by 5");
else if (num % 5 == 0)
System.out.println("Divisible by 5 but not by 3");
else
System.out.println("Neither divisible by 3 nor by 5");
}
}