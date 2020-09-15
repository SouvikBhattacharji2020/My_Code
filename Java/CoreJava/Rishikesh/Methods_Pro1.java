public class Methods_Pro1 {
    
    public static void rishikesh(){
    	System.out.println("My name is Rishikesh.");
    }

    public static void rishikesh1(){
    	System.out.println("My name is Souvik.");
    }

    public static int rishikesh2(int m,int n){

    	m++;
    	int s=m+n;
    	System.out.println(s);
    	return s;
    }

    /*public static String rishikesh3(){
    	String n="Souvik";
    	return n;
    }*/

    public static String rishikesh4(String n1){
    	String n="Souvik";
    	return n1;
    }

    public static void main(String args[]) {
     
     Methods_Pro1 mp1=new Methods_Pro1();
     String f="Ram"; 
     String x=mp1.rishikesh4(f);
     System.out.println(x);
    }
}