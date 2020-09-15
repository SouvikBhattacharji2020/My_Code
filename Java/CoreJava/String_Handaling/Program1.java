/*
String Handling Programs
*/
public class Program1
{
	public static void main(String args[])
	{
		String name="Souvik";
		// To findout the length of the String.
		int length=name.length();
		System.out.println(length);

		// to use char array as String.
		char[] name1={'A','s','a','n','s','o','l'};
		String str1=new String(name1,0,2);
		String str2=new String(name1,3,1);

		System.out.println(str1+str2);
		
		// Displying any String value
		String st3=new String("Souvik");
		System.out.println(st3);

		// Use of " char charAt(int index); "
		

	}
}