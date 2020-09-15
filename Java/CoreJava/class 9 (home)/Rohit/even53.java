import java.io.*;

class even53
{
    public static void main (String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        int x=0,n=53,i;
 
        try
        {
            System.out.print("How many even numbers to print:");
            x=Integer.parseInt(in.readLine());
            
            for(i=1;i<=x;)        
            {
             if(n%2==0)
             {
                 System.out.print(n+"/t");
                 i++;
            }
            n++;
            }
        }
        catch(Exception e)
        {};
    }
}