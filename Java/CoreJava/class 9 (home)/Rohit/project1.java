import java.util.*;
public class project1
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the 1st number :");
		int a=sc.nextInt();

        System.out.println("Enter the 2nd number :");
		int b=sc.nextInt();

		int m=(a<b)?b:a;
		System.out.println(m);
	}
}