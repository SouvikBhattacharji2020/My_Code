import java.io.*;

class eighteen
{
    public static void main (String args [])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        double l,b,a=0.0,p=0.0,d=0.0d;
        
        try
        {
          System.out.println("enter length:");
          l=Double.parseDouble(in.readLine());
          System.out.println("Enter breadth");
          b=Double.parseDouble(in.readLine());
          
          a=l*b;
          p=2*(l+b);
          d=Math.sqrt(l*l+b*b);
          
          System.out.println("area of the rectangle ="+a);
          System.out.println("perimeter of the rectangle ="+p );
          System.out.println("diagonal of the rectangle ="+d);
          
        }
        catch(Exception e)
        {};
    }
}

        