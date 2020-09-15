/*
1 3 5 7 9
3 5 7 9 1
5 7 9 1 3
7 9 1 3 5
9 1 3 5 7 
*/

import java.util.*;

class Program2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter last number of series :-");
		int x=sc.nextInt();

		for(int i=1;i<=x;i+=2)
		{
			for(int j=i;j<=x;j+=2)
			{
				System.out.print(j+" ");
			}
			for(int k=1;k<i;k+=2)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}