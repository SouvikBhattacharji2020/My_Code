import java.io.*;

class table extends power
{
    public static void main(String args[])
    {
        DataInputStream in=new DataInputStream(System.in);
        
        int n,i;
        
        try
        {
            System.out.print("Enter no.whose table you want to print:");
            n=Integer.parseInt(in.readLine());
            
            for(i=1;i<=20;i++)
            {
                System.out.println(n+"x"+i+"="+(n*i));
            }
        }
        catch(Exception e)
        {};
    }
}