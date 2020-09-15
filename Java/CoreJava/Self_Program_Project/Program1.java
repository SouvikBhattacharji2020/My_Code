/*Write a program in java to assign two number 1273 and 58 in a suitable variable. 
Find its sum, difference, product, quotient and remainder. 
Display all values with proper message.
*/

import java.io.*;

public class Program1 {

	public static void main(String[] args) {
		
		try{
		DataInputStream in = new DataInputStream(System.in);
		System.out.println("Enter a number : ");
		int no = Integer.parseInt(in.readLine());

		System.out.println(no);
	}
		catch(Exception e){};

	}

}
