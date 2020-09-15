public class Program_of_postfix_prefix {
    public static void main(String args[]) {
      int a=5;
      int b=2;
      int c=8;
      
      b+= ++a - b - ++c;
      /*
      b+= 6 -2 - 9=2 + -5=-3     a=6 b=-3 c=9    
      */
      c -= a++ + ++b - c--;
      /*
      c -= 6 + -2 - 9=c - -5 =9+5=14        a=7 b=-2 c=14    
      */
      System.out.println("a = "+a+" b= "+b+" c= "+c);
      
    }
}