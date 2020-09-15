import java.io.*;

class odd_even_number
{
    public static void main (String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        int n,i,x,ev=0,od=0;
        
        try
        {
            System.out.print("how many numbers to input:");
            n=Integer.parseInt(in.readLine());
            
            for(i=1;i<=n;i++)
            {
                System.out.print("Enter any number:");
                x=Integer.parseInt(in.readLine());
                
                if(x%2==0)
                          ev=ev+x;
                else
                          od=od+x;      
            }
            System.out.println("Sum of even numbers="+ev);
            System.out.println("Sum of odd numbers="+od);
        }
        catch (Exception e)
        {};
    }
}