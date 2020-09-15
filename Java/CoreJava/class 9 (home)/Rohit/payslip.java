import java.io.*;
class payslip
{
    public static void main (String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        int bp;
        double dp,hp,da,hra,gp;
        dp=hp=da=hra=gp=0.0d;
        
        try
        {
            System.out.print("enter basic pay");
            bp=Integer.parseInt(in.readLine());
            
            if(bp<=30000)
            {
                dp=58.5d;
                hp=12.0d;
            }
            if(bp>=30001 && bp<=50000)
            {
                dp=65.0d;
                hp=16.5d;
            }
            if(bp>50000)
            {
                dp=73.0d;
                hp=24.8d;
            }
            da=(dp/100.0d)*bp;
            hra=(hp/100.0d)*bp;
            gp=bp+da+hra;
            
            System.out.println("Gross pay ="+gp);
        }
        catch (Exception e)
        {};
    }
}
