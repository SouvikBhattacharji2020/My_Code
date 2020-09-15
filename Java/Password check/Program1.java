import java.util.*;

class Program1 {
  public static void main(String args[]) {
    System.out.print("Enter your password :-");
    Scanner sc = new Scanner(System.in);
    String pass = sc.nextLine();
    int no = pass.length();
    // System.out.print(no);
    char st, st1, st2, st3, st4;
    String check = "";
    char ch = 'a';
    char ch1 = 'a';
    char ch2 = 'a';
    char ch3 = 'a';
    char ch4 = 'a';

    if (no >= 6) {

      for (int x = 0; x < no; x++) {
        char i1 = pass.charAt(x);
        int i = (int) i1;
        // System.out.println(i);

        if (i >= 48 && i <= 57) {
          ch = 's';
        }

        if (i1 >= 'a' && i1 < 'z') {
          ch1 = 't';
        }
        if (i1 >= 'A' && i1 <= 'Z') {
          ch2 = 'a';
        }
        if (i1 != ' ') {
          ch3 = 'r';
        }
        if (i1 == '.' || i1 == '!' || i1 == '*' || i1 == '.' || i1 == '$' || i1 == '#'
            || i1 == '@') {
          ch4 = 't';
        }
      }
      check = check + ch + ch1 + ch2 + ch3;
      check = check + ch4;
      System.out.println(check);
      // System.out.print(st10);
      if (check.equals("start")) {
        System.out.println("Welcome");
      } else {
        System.out.println("The password is not valid");
      }

    } else {
      System.out.println(" The password is not valid ");
    }
  }
}
