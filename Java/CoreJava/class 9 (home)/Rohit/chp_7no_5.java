import java.util.*;
public class chp_7no_5
{
public static void main (String args [])
 {
Scanner in = new Scanner(System.in);
System.out.print("Enter the year to check: ");
int yr = in.nextInt();
if (yr % 4 == 0 && yr % 100 != 0)
System.out.println("It is a Leap Year");
else if (yr % 400 == 0)
System.out.println("It is a Century Leap Year");
else if (yr % 100 == 0)
System.out.println("It is a Century Year but not a Leap Year");
else
System.out.println("It is neither a Century Year nor a Leap Year");
}
}