
import java.io.*;
class test extends duplicate_eighteen
{
    public static void main (String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        int n,i,f=1;
        try
        {
           
            System.out.print("enter the no of n th term");
            n=Integer.parseInt(in.readLine());
            for(i=1;i<=n;i++)
            {
                f=f*i;
               if(i==n)
                System.out.print(i);
                else
                System.out.print(i+"X");
                               
            }
            System.out.print("="+f);
          
        }
        catch(Exception e)
        {};
    }
}
