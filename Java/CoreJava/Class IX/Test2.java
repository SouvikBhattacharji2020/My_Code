/*
Wap to create diagram bellow.
@ @ @ @ @
@       @
@       @
@       @
@ @ @ @ @
*/

import java.util.*;

class Test2
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number of row/coloumn :");
		int no=sc.nextInt();
		if(no>1)
		{
		for(int i=0;i<no;i++)
		{
			System.out.print("@ ");
			
			for(int j=0;j<no-2;j++)
			{	
				if(i==0||i==no-1)
				{		
					System.out.print("@ ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.print("@");
			
			System.out.println();
			
		}
	}else{
		System.out.println("Please enter more then 1");
	}
	}
}