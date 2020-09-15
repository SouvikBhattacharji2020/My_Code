import java.io.*;

class prog14
{
    public static void main(String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        int a,b,c,max=0;
        try
        {
            System.out.println("enter three numbers");
            a=Integer.parseInt(in.readLine());
            b=Integer.parseInt(in.readLine());
            c=Integer.parseInt(in.readLine());
            
            if(a>b && a>c)
                   max=a;
            
            if(b>a && b>c)
                   max=b;
            
            if(c>a && c>b)
                   max=c;

            System.out.println("maximum number is"+max);
        }
        catch(Exception e)
        {};
    }
}       