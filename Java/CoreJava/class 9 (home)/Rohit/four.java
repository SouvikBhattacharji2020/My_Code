import java.io.*;
class four
{
    public static void main (String args [])
    {
        DataInputStream in = new DataInputStream(System.in);
        int a,b;
        try
        {
            System.out.print("enter first number");
            a=Integer.parseInt(in.readLine());
            System.out.print("enter second number");
            b=Integer.parseInt(in.readLine());
            
            if (a>b)
            {
                System.out.println("greater number is :"+a);
                System.out.println("double of the greater no . is :"+(a*2));
            }
            else
            {
                System.out.println("Smaller no is :"+a);
                System.out.println("Square root of the smaller no is :"+Math.sqrt(a));
            }
        }
        catch (Exception e)
        {};
    }
}
            
      
        

    