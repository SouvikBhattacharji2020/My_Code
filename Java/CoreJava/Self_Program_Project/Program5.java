public class Program5{
	public static void main(String args[])
	{
		for(int i=1000;i<=9999;i++)
		{
			int m1=i/100;
			int m2=i%100;
			int m3=m1+m2;
			if (i==(Math.pow(m3,2)))
			{
				System.out.println("The numer "+i+" is a take number.");
			}
		}
	}
}