import java.io.*;
class input
{
    public static void main(String args [])
    {
        DataInputStream in = new DataInputStream (System.in);
        
        int a=0;
        try
        {
            System.out.print("Enter a number");
           a=Integer.parseInt(in.readLine());
            
            System.out.println("my number is "+a);
        }
        catch (Exception e )
        {};
    }
}