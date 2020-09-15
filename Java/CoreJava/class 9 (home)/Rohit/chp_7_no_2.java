import java.util.Scanner;
public class chp_7_no_2
{
public static void main (String args [])
 {
Scanner in = new Scanner(System.in);
System.out.print("Enter cost price of the article: ");
double cp = in.nextDouble();
System.out.print("Enter selling price of the article: ");
double sp = in.nextDouble();
double pl = sp - cp;
double percent = Math.abs(pl) / cp * 100;
if (pl > 0)
 {
System.out.println("Profit = " + pl);
System.out.println("Profit % = " + percent);
}
else if (pl < 0)
 {
System.out.println("Loss = " + Math.abs(pl));
System.out.println("Loss % = " + percent);
}
else
 {
System.out.println("Neither profit nor loss");
}
}
}