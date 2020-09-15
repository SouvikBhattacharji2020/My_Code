import java .io.*;
class one
{
    public static void main (String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        int n;
        try
        {
            System.out.print("enter a number");
            n=Integer.parseInt(in.readLine());
            
            if(n>0)
            System.out.println("positive number");
            
            if (n<0)
            System.out.println("negative number");
            
            if (n==0)
            System.out.println("zero");
        }
        catch (Exception e)
        {}
    }
}