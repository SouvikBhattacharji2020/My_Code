import java.io.*;

class commision
{
    public static void main(String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        int sa,cp=0;
        double cpaid=0.0d;
        
        try
        {
            System.out.print("enter total sales:");
            sa=Integer.parseInt(in.readLine());
            
            if(sa<=10000)
            cp=2;
            
            if(sa>=10001 && sa<=20000)
            cp=4;
            
            if(sa>=20001 && sa<=50000)
            cp=8;
            
            if(sa>=50000)
            cp=15;
            
            cpaid=(cp/100.0d)*sa;
            
            System.out.println("commision%="+cp);
            System.out.println("commision payable="+cpaid); 
        }
        catch(Exception e)
        {};
    }
}