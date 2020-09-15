import java.util.Scanner;
public class chp_8_no_4
{
 public static void main(String args[]) {
 final int COUNT = 50;
 Scanner in = new Scanner(System.in);
 int n, c = 0;
 System.out.println("Enter " + COUNT + " numbers");
 for (int i = 1; i <= COUNT; i++) {
 n = in.nextInt();
 if (i % 5 == 0) {
 if (i % 10 == 5)
 System.out.println("Number end with the digit 5");
 if (i % 10 == 0)
 c++;
 }
 }
 System.out.println("Count of numbers ending with 0: " + c);
 }
}