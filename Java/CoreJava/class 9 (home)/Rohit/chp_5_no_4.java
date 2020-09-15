
import java.util.Scanner;
public class chp_5_no_4
{
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.print("Enter price of article: ");
double price = in.nextDouble();
double d1 = price * 30 / 100.0;
double amt1 = price - d1;
System.out.println("30% discount = " + d1);
System.out.println("Amount after 30% discount = " + amt1);
double d2 = price * 20 / 100.0;
double amt2 = price - d2;
double d3 = amt2 * 10 / 100.0;
amt2 -= d3;
System.out.println("20% discount = " + d2);
System.out.println("10% discount = " + d3);
System.out.println("Amount after successive discounts = " + amt2);
}
}