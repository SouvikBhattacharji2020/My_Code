
import java.util.Scanner;
public class chp_5_no_1

{
public static void main(String args[]) 
 {
 Scanner in = new Scanner(System.in);
 System.out.print("Enter length: ");
 double l = in.nextDouble();
 System.out.print("Enter g: ");
 double g = in.nextDouble();
 double t = 2 * (22.0 / 7.0) * Math.sqrt(l/g);
 System.out.println("T = " + t);
}
}