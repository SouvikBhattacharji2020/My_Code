// Write a program to accept two number from user and find out which one is the greatest?

import java.io.*;

class Project_pro1{
    public static void main(final String args[]) {

        final DataInputStream in = new DataInputStream(System.in);
        try {
            System.out.println("Enter 1st Number : ");
            final int a = Integer.parseInt(in.readLine());
            System.out.println("Enter 2nd Number : ");
            final int b = Integer.parseInt(in.readLine());
            if (a < b) {
                System.out.println(b + " is the greatest one.");
            } else {
                System.out.println(a + " is the greatest one.");
            }

        } catch (final Exception e) {
        }
        ;

    }
}
