import java.util.Scanner;
public class chp_5_no_2
{
public void computePay() {
Scanner in = new Scanner(System.in);
System.out.print("Enter Basic Pay: ");
double bp = in.nextDouble();
double da = 0.3 * bp;
double hra = 0.15 * bp;
double pf = 0.125 * bp;
double gp = bp + da + hra;
double np = gp - pf;
System.out.println("Gross Pay = " + gp);
System.out.println("Net Pay = " + np);
}
}