/*
Homework: print this pattern-

Enter the number of rows to print the pattern 
5
** Printing the pattern... **
    1 
   121 
  12421 
 1248421 
1248168421

*/

import java.util.Scanner;

public class HomeWork11_8_2020
{
        public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);
        // Get the number of rows from the user
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            int val1 = 1;
            for (int k = 1; k <= i; k++)
            {

                System.out.print(val1 + "");
                val1 = val1 * 2;
            }
            val1 = val1 / 4;
            for (int l = i - 1; l >= 1; l--)
            {
                System.out.print(val1 + "");
                val1 = val1 / 2;
            }
            System.out.println();
        }
    }
}