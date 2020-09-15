import java .io.*;
class number 
{
    public static void main (String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        int n;
        try
        {
            System.out.print("enter a number");
            n=Integer.parseInt(in.readLine());
            System.out.println("the nuber is "+n);
        }
        catch (Exception e)
        {}
    }
    
}
    