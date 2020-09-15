import java.io.*;
class final_thirty
{
    public static void main (String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        int n,i,s=0;
        try
        {
            System.out.print("Enter any number :");
            n=Integer.parseInt(in.readLine());
            
            for(i=1;i<=n/2;i++)
            {
                if(n%i==0)
                       s=s+i;
            }
            if(n==s)
                  System.out.println("it is a perfect number");
            else
                  System.out.println("It is not a perfect square");
        }
        catch (Exception e)
        {};
    }
}