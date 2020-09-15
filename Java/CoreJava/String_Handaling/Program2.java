public class Program2
{
	public static void main(String args[])
	{
		 String name="I am Hobel. And I like to read book";
     System.out.println(name);
        String result="";
        int a=0;
        
        for(int i=0;i<name.length();i++)
        {
        char m=name.charAt(i);
        //System.out.println(m);
        if(m !=' ')
        {
        a=(int)m;
        a=a+2;
        char s = (char)a;
        result=result+s;
    }
    else{
        result=result+" ";
    }
    
        }
        System.out.println(result);
	}
}