import java.io.*;
class final_nineteen
{
    public static void main (String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        int n,i,pos,neg,ze,sev;
        pos=neg=ze=sev=0;
        
        try
        {
            for(i=1;i<=20;i++)
            {
             System.out.print("enter any number:");
             n=Integer.parseInt(in.readLine());
             
             if(n>0)
                pos++;
             if(n<0)   
                neg++;
             if(n==0)
                ze++;
             if(n%10==7)
                sev++;
            }
            System.out.println("Number of positive Numbers ="+pos);
            System.out.println("Number of negative numbers ="+neg);
            System.out.println("Number of zeros ="+ze);
            System.out.println("Number of nos.Ending with 7="+sev);
        }
        catch (Exception e)
        {};
    }
}
