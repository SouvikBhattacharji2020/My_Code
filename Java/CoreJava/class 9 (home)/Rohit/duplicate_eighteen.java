
import java.io.*;
class duplicate_eighteen extends eighteen
{
    public static void main (String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        int nb,dp=0;
        double dis =0.0d,amt=0.0d;
        
        try
        {
            System.out.print("enter net bill:-");
            nb=Integer.parseInt(in.readLine());
            
            if(nb<5000)
               dp=5;
            if(nb>=5000&&nb<10000)
               dp=10;
            if(nb>=10000)
               dp=15;
               
            dis=(dp/100.0d)*nb;
            amt=nb-dis;
            
            
            System.out.println("discount%="+dp);
            System.out.println("discount amount="+dis);
            System.out.println("amount to be paid after the discount"+amt);
        }
        catch (Exception e)
        {};
    }
}