import java.io.*;

class twentyfive
{
    public static void main (String args[])
    {
        DataInputStream in= new DataInputStream(System.in);

        double mp,d1,d2,nmp,sp;
        mp=d1=d2=sp=0.0d;
        
        try
        {
            System.out.print("Enter the marked price of the product :");
            mp=Double.parseDouble(in.readLine());
            
            d1=(50/100.0d)*mp;
            nmp = mp-d1;
            
            d2=(75/100.0d)*nmp;
            sp=nmp-d2;
            
            System.out.println("discount-1 @ 50% ="+d1);
            System.out.println("discount-2 @ 75% ="+d2);
            System.out.println("selling price ="+sp);
        }
        catch(Exception e)
        {};
    }
}
            
            