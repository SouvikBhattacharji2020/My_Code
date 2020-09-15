
/*Write a program in java to assign two number 1273 and 58 in a suitable variable. 
Find its sum, difference, product, quotient and remainder. 
Display all values with proper message.
*/

class Program2 {

	public static void main(String[] args) {
	
		int a=1273, b=58, sum=0, diff=0, product=0;
		sum=a+b;
		System.out.println("The sum is "+sum);
		diff=a-b;
		System.out.println("The difference is "+diff);
		product=a*b;
		System.out.println("The product is "+product);
		double quotient=a/b;
		System.out.println("The quotient is "+quotient);
		int rem=a%b;
		System.out.println("The remainder is "+rem);
	}

}
