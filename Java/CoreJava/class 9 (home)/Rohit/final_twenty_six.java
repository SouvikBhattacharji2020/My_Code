import java.io.*;
class final_twenty_six
{
    public static void main (String args [])
    {
        DataInputStream in = new DataInputStream(System.in);
        int n,i,sum=0,f=0;
        double avg=0.0d;
        
        try
        {
            for(i=1;i<=10;i++)
            {
                System.out.print("enter any number");
                n=Integer.parseInt(in.readLine());
                
                sum=sum+n;
                
                if(n%5 == 0)
                       f++;
            }
            avg = sum/10.0d;
            System.out.println("sum of numbers = "+sum);
            System.out.println("Average of numbers = "+avg);
            System.out.println("Number entered that are divisible by 5 = "+f);
        }
        catch (Exception e)
        {};
    }
}