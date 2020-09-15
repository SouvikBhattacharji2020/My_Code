import java.util.Scanner;
public class chp_7_no_14
{
public static void main (String args []) 
{
Scanner in = new Scanner(System.in);
System.out.print("Enter name: ");
String name = in.nextLine();
System.out.print("Enter basic salary: ");
double bs = in.nextDouble();
double da = 0.0, sa = 0.0;
if (bs <= 10000)
{
da = bs * 10.0 / 100.0;
sa = bs * 5.0 / 100.0;
}
else if (bs <= 20000)
{
da = bs * 12.0 / 100.0;
sa = bs * 8.0 / 100.0;
}
else if (bs <= 30000)
{
da = bs * 15.0 / 100.0;
sa = bs * 10.0 / 100.0;
}
else
{
da = bs * 20.0 / 100.0;
sa = bs * 12.0 / 100.0;
}
double gs = bs + da + sa;
System.out.println("Name\tBasic\tDA\tSpl. Allowance\tGross Salary");
System.out.println(name + "\t" + bs + "\t" + da + "\t" + sa + "\t" + gs);
}
}