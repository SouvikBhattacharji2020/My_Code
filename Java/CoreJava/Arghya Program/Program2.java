import java.io.*;

class Program2
{
	public static void main(String args[])
	{
		try{
		DataInputStream sc=new DataInputStream(System.in);

		System.out.println("Enter fist number : ");
		int a=Integer.parseInt(sc.readLine());

		System.out.println("Enter fist number : ");
		int b=Integer.parseInt(sc.readLine());

		int sum=a+b;
		System.out.println("Total is : "+sum);

		double avg=(sum/2.0);
		System.out.println("Avarage is : "+avg);


		}
		catch(Exception e){};
	}
}