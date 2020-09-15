import java.util.Scanner;
public class chp_8_no_5
{
 public static void main(String args[]) {
 Scanner in = new Scanner(System.in);
 System.out.print("Enter m: ");
 int m = in.nextInt();
 System.out.print("Enter n: ");
 int n = in.nextInt();

 if (m < n && m > 0 && n > 0) {
 for (int i = m; i <= n; i++) {
 System.out.println("Number = " + i);
 double sroot = Math.sqrt(i);
 if (sroot == Math.floor(sroot))
 System.out.println(i + " is a perfect square");
 }
 }
 else {
 System.out.println("Invalid input");
 }
 }
}