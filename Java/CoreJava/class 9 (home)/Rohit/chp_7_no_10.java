import java.util.Scanner;
public class chp_7_no_10
{
    public static void main (String args [] ) 
    {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter total cost: ");
      double cost = in.nextDouble();
      String gift;
      double amt;
      if (cost <= 2000.0)
       {
        amt = cost - (cost * 5 / 100);
        gift = "Calculator";
        }
       else if (cost <= 5000.0)
       {
         amt = cost - (cost * 10 / 100);
         gift = "School Bag";
        }
        else if (cost <= 10000.0)
         {
       amt = cost - (cost * 15 / 100);
      gift = "Wall Clock";
}
else
 {
amt = cost - (cost * 20 / 100);
gift = "Wrist Watch";
}
System.out.println("Amount to be paid: " + amt);
System.out.println("Gift: " + gift);
}
}