
import java.util.Scanner;
public class chp_5_no_9
{
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.print("Enter Amount: ");
double p = in.nextDouble();
double si = p * 10 * 3 / 100;
double ciAmt = p * Math.pow(1 + (10/100.0), 3);
double ci = ciAmt - p;
System.out.print("Difference between CI & SI: " + (ci - si));
}
}