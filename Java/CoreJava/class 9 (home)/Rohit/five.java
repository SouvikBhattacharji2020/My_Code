import java.io.*;
class five
{
    public static void main (String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        int n,sq=0;
        try
        {
            System.out.print("Enter any number ");
            n= Integer.parseInt(in.readLine());
            
            sq=(int)Math.sqrt(n);
            if ((sq*sq)==n)
            System.out.println("perfect square");
            else
            System.out.println("not a perfect square");
        }
        catch (Exception e)
        {};
    }
}