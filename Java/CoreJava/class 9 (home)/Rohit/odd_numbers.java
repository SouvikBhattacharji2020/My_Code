import java.io.*;

class odd_numbers
{
    public static void main (String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        int n,i=0,s,ts;
        
        try
        {
         System.out.print("Enter the nth term");
         n=Integer.parseInt(in.readLine());
         
         for(i=1;i<=n;i++)
         {
             ts=n+1;
         }
         System.out.print("Sum"+n);
        }
        catch (Exception e)
        {};
    }
}