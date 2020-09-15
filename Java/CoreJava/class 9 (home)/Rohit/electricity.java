import java.io.*;

class electricity
{
    public static void main (String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        int u,mr=35;
        double bill=0.0d;
        
        try
        {
            System.out.print("enter units consumed:");
            u=Integer.parseInt(in.readLine());
            
            if(u<=200)
                  bill = u*4.5d;
             
            if(u>200 && u<=400)
                  bill = 200*4.5+((u-200)*5.5d);
                  
            if(u>400)      
                  bill = 200*4.5d+200*5.5d+((u-400)*6.5d);
                  
            bill=bill+mr;
            
            System.out.println("bill with meter rent="+bill);
        }
        catch(Exception e)
        {};
    }
}
          