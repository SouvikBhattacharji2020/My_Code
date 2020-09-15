import java.util.*;

public class MyClass {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] m1 = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.println("enter number :");
      m1[i] = sc.nextInt();
    }
    for (int j = 0; j < m1.length; j++) {

      System.out.print(m1[j] + ", ");
    }
  }
}
