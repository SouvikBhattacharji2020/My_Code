/*
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
*/

import java.util.*;

class Program1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of series :-");
		int x=sc.nextInt();

		for(int i=x;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}