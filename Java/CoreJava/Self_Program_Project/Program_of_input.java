import java.io.*;

class Program_of_input
{
    public static void main(String args[])
    {
        DataInputStream in =new DataInputStream(System.in);
        try
        {   
            
            // To storeing String value.
            System.out.println("Enter your name :");
            String name=in.readLine();
            System.out.println("My name is :"+name);
            
            // To storeing Integer value.
            System.out.println("Enter a number :");
            int a=Integer.parseInt(in.readLine());
            System.out.println("You enter :"+a);
            
            // To store character value.
            System.out.println("Enter a letter:");
            char name_char=(char)in.read();
            System.out.println("you enter a letter :"+name_char);
           
            // To storeing float value.
            System.out.println("Enter a number :");
            float a1=Float.parseFloat(in.readLine());
            
            System.out.println("Enter a number :");
            float a2=Float.parseFloat(in.readLine());
            
            float sum =a1+a2;
            System.out.println("Sum :"+sum);
        }
        catch(Exception e){};
        
    }
}