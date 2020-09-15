import java.io.*;
class three
{
    public static void main(String args [])
    {
        DataInputStream in = new DataInputStream(System.in);
        int n;
        try
        {
            System.out.print("enter any number;");
            n=Integer.parseInt(in.readLine());
            
            if(n%2==0)
            System.out.println("even");
            else 
            System.out.println("odd");
        }
        catch(Exception e)
        {};
    }
}