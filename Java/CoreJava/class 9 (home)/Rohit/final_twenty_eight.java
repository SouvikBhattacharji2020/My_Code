import java.io.*;
class final_twenty_eight
{
    public static void main (String args [])
    {
        DataInputStream in  = new DataInputStream(System.in);
        int n,i,f=0;
        try
        {
            System.out.print("Enter any number :");
            n=Integer.parseInt(in.readLine());
            
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                       f++;
            }
            if (f==2)
             System.out.println("IT IS A PRIME NUMBER");
             else
             System.out.println("IT IS NOT A PRIME NUMBER ");
        }
        catch (Exception e)
        {};
    }
}