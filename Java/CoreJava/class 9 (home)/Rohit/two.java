import java.io.*;
class two
{
    public static void main(String args [])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        int cp,sp,p=0,l=0;
        double pp=0.0d,lp=0.0d;
        try
        {
            System.out.print("enter the cost price");
            cp=Integer.parseInt(in.readLine());
            
            System.out.println("enter selling price");
            sp=Integer.parseInt(in.readLine());
            if(sp>cp)
            {
                p=sp-cp;
                pp=(p*100.0d)/cp;
                
                System.out.println("Profit="+p);
                System.out.println("profit %="+pp);
            }
            if (cp>sp)
            {
                 l=cp-sp;
                lp=(l*100.0d)/cp;
                
                System.out.println("loss"+l);
                System.out.println("loss %"+lp);
        }
        if (cp==sp)
        System.out.println("no profit-no loss");
    }
        catch(Exception e)
        {};
    }
}