import java.io.*;

class tempreature  
{
    public static void main (String args [])
    {
        DataInputStream in=new DataInputStream(System.in);
        
        double f,c=0.0d;
         
        try
        {
         System.out.println("enter the tempreture in fahrenheit :");
         f=Double.parseDouble(in.readLine());

         c=(5/9.0d)*(f-32.0d);
       
         System.out.println("tempreture  in celcius"+c);
        }
        catch(Exception e)
        {};
    }
}
