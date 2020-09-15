/*
2
444
66666
8888888
*/
public class MyClass {
    public static void main(String args[]) {
     int x=2;
     for(int i=1;i<=11;i=i+2)
     {
         for(int j=1;j<=i;j++)
         {
             System.out.print(x);
         }
         System.out.println();
         x=x+2;
     }
    }
}