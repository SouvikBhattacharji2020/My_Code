import java.io.*;

class ao
{
    public static void main(String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        int a=0,i;
        try
        {
            System.out.print("ENTER A NUMBER");
            a=Integer.parseInt(in.readLine());
            
            for(i=1;i<=a;i++)
            {
                System.out.print(i+"+");
            }
        } 
        catch (Exception e)
        {};
    }
}