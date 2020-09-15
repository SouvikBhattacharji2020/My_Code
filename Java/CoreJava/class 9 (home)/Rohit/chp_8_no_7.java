import java.util.Scanner;
public class chp_8_no_7
{
 public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int ta = 0, te = 0, tm = 0, ts = 0;
    for (int i = 1; i <= 40; i++) 
   {
     System.out.println("Enter marks of student " + i);
     System.out.print("English: ");
     int eng = in.nextInt();
     System.out.print("Maths: ");
     int maths = in.nextInt();
     System.out.print("Science: ");
     int sci = in.nextInt();

     if (eng >= 95 && maths >= 95 && sci >= 95)
     ta++;

     if (eng >= 90)
     te++;

     if (maths >= 90)
     tm++;

     if (sci >= 90)
     ts++;
   }
    System.out.println("No. of students >= 95% in all subjects: " + ta);
    System.out.println("No. of students >= 90% in English: " + te);
    System.out.println("No. of students >= 90% in Maths: " + tm);
    System.out.println("No. of students >= 90% in Science: " + ts);
  }
}