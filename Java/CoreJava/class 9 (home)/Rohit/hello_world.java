import java.util.*;
public class hello_world
{
	public static void main (String args [] )
	{
	  Scanner in = new Scanner(System.in);
	  int a,b,c,x,y,x1,y1;
	  
	  System.out.println ("Enter the 1st no");
	  a=in.nextInt();
	  
	  System.out.println ("Enter the 2nd no");
	  b=in.nextInt();
	  
	  System.out.println ("Enter the 3rd no");
	  c=in.nextInt();
	  
	  x=Math.min(a,b);
	  y=Math.min(x,c);
	  System.out.println ("the minimum value between 3 numbers is "+y);
	  
	  x1=Math.max(a,b);
	  y1=Math.max(x1,c);
	  System.out.println ("the maximum value between 3 numbers is "+y1);
	  
	  int sum = (a+b+c)-(y+y1);
	  System.out.println ("the second minimum value between 3 numbers is "+sum);
	}
}