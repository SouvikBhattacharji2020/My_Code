

 import java.io.*;  
class looping_condition
{
    public static void main (String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        int a,sum=0,avg;
        
        try
        {
        for(int i=1;i<=20;i++)
        {
            System.out.println("Enter a value");
            a=Integer.parseInt(in.readLine());
            
            sum=sum+a;
            avg=(sum/20);
            
            System.out.println("sum"+sum);
            System.out.println("avg"+avg);
        }
    }
    catch(Exception e)
    {};
    }
}
        