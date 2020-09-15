import java.util.Scanner;
public class chp_7_no_13
{
 public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.print("Enter Name: ");
String name = in.nextLine();
System.out.print("Enter Sum Assured: ");
double sum = in.nextDouble();
System.out.print("Enter First Premium: ");
double pre = in.nextDouble();
double disc = 0.0, comm = 0.0;
if(sum <= 100000)
{
disc = pre * 5.0 / 100.0;
comm = sum * 2.0 / 100.0;
}
else if(sum <= 200000)
{
disc = pre * 8.0 / 100.0;
comm = sum * 3.0 / 100.0;
}
else if(sum <= 500000)
{
disc = pre * 10.0 / 100.0;
comm = sum * 5.0 / 100.0;
}
else
{
disc = pre * 15.0 / 100.0;
comm = sum * 7.5 / 100.0;
}
System.out.println("Name of the policy holder: " + name);
System.out.println("Sum assured: " + sum);
System.out.println("Premium: " + pre);
System.out.println("Discount on the first premium: " + disc);
System.out.println("Commission of the agent: " + comm);
}
}