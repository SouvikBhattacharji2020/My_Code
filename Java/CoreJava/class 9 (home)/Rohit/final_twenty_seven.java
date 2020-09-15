import java.io.*;
class final_twenty_seven
{
    public static void main (String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        int n,i,f=1,a;
        try
        {
            System.out.print("enter the no of terms whoose factorial you want to see my Boss");
            a=Integer.parseInt(in.readLine());
            System.out.print("enter the no of n th term");
            n=Integer.parseInt(in.readLine());
            System.out.print("factorial of the number you entered to see , that is  ="+a+"is ="); 
            for(i=1;i<=n;i++)
            {
               
                System.out.print(a+"X"+i+"="+(a*i));
            }
          
        }
        catch(Exception e)
        {};
    }
}
