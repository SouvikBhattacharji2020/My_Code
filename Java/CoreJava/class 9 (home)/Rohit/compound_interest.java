import java.util.*;
public class compound_interest
{
    public static void main (String args [])
   {  
      Scanner in = new Scanner (System.in);
      double p ,cif,taf,tas=0.0,cis,cit;
      System.out.println("enter the principle");
      p=in.nextInt();
      tas=p;
      for(int i=0;i<3;i++)
      {
          
        cif = tas*(5.0/100.0);
        tas = tas+cif;
        System.out.println(tas);
         
      cif=p*(5.0/100.0);
      taf=p+cif;
      cis=taf*(5.0/100.0);
      tas=p+cis;
      cit=tas*(5.0/100.0);
      
      System.out.println("first interest"+cif);
      System.out.println("second interest"+cis);
      System.out.println("third interest"+cit);
      
      }
    }
}