import java.util.Scanner;
public class chp_5_no_7
{
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.print("Enter time in seconds: ");
long secs = in.nextLong();
long hrs = secs / 3600;
secs %= 3600;
long mins = secs / 60;
secs %= 60;
System.out.println(hrs + " Hours " + mins
+ " Minutes " + secs + " Seconds");
}
}