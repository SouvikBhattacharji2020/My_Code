import java.io.*;

class alphabet
{
    public static void main (String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        
        char ch;
        String x;
        try
        {
            System.out.print("enter any character:");
            ch=(char)System.in.read();
            
            if(ch>'A' && ch<='Z')
            System.out.println("It is upper case alphabet");
            
            if(ch>='a' && ch<='z')
            System.out.println("It is lower case alphabet");
            
            if(ch>='0' && ch<='9')
            System.out.println("it is a digit");
            
        }
        catch (Exception e)
        {};
    }
} 