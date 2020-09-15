
 // 0,1,1,2,3,5,... nth term.

import java.util.*;
public class Program1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n th term of fibonacci series : ");
		int n=sc.nextInt();
		int a=0,b=1,c=0;
		System.out.print(a+",");
		for(int i=0; i < n; i++)
		{
			System.out.print(b+",");
			c=a+b;
			a=b;
			b=c;
		}
	}
}
