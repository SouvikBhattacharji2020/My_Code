import java.util.Scanner;
public class chp_7_no_20
{
public static void main (String args [])
{
Scanner in = new Scanner(System.in);
System.out.print("Enter Name: ");
String name = in.nextLine();
System.out.print("Enter Amount of Purchase: ");
double amt = in.nextDouble();
System.out.println("Enter Type of Purchase");
System.out.print("'L'- Laptop or 'D'- Desktop: ");
char type = in.next().charAt(0);
type = Character.toUpperCase(type);
double disc = 0.0;
if (amt <= 25000)
disc = type == 'L' ? 0.0 : 5.0;
else if (amt <= 50000)
disc = type == 'L' ? 5.0 : 7.0;
else if (amt <= 100000)
disc = type == 'L' ? 7.5 : 10.0;
else
disc = type == 'L' ? 10.0 : 15.0;
double netAmt = amt - (disc * amt / 100);
System.out.println("Name: " + name);
System.out.println("Net Amount: " + netAmt);
}
}