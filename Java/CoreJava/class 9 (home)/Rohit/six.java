import java.io.*;
class six
{
    public static void main (String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        int a,b,s=0;
        try
        {
            System.out.print("enter the first angle");
            a=Integer.parseInt(in.readLine());
            
            System.out.print("enter the second angle");
            b=Integer.parseInt(in.readLine());
            
            s=a+b;
            
            System.out.println ("sum of the angles");
            
            if (s==90)
                System.out.println("it is a complementary angle");
            else
                System.out.println("it is not a complementary angle");
        }
        catch (Exception e)
        {};
    }
}
    