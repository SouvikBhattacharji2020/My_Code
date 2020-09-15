/*

Kumar Electronics has announced the following seasonal discounts on purchase of certain items:
Up to Rs. 25000: Laptop = 0.0% Desktop = 5.0%
Rs. 25001 to Rs. 50000: Laptop = 5.0% Desktop = 7.5%
Rs. 50001 to Rs. 100000 Laptop = 7.5% Desktop = 10.0%
More than Rs. 100000 Laptop = 10.0% Desktop = 15.0%
Write a program to input name, amount of purchase and the type of purchase (‘L’ for Laptop and ‘D’ for Desktop) by a customer. Compute and print the net amount to be paid by a customer along with his name.
Net amount = Amount of purchase – Discount.
b) Give the variable list for the above program.

*/


import java.util.Scanner;

public class Program11
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = in.nextLine();
        System.out.print("Enter Amount of Purchase: ");
        double amt = in.nextDouble();
        System.out.println("Enter Type of Purchase");
        System.out.print("'L'- Laptop or 'D'- Desktop: ");
        char type = in.next().charAt(0);
        type = Character.toUpperCase(type);
        double disc = 0.0;
        
        if (amt <= 25000)
            disc = type == 'L' ? 0.0 : 5.0;
        else if (amt <= 50000)
            disc = type == 'L' ? 5.0 : 7.0;
        else if (amt <= 100000)
            disc = type == 'L' ? 7.5 : 10.0;
        else
            disc = type == 'L' ? 10.0 : 15.0;
            
        double netAmt = amt - (disc * amt / 100);
        
        System.out.println("Name: " + name);
        System.out.println("Net Amount: " + netAmt);
    }
}

/*
veriable listing : -
Name    |    Data Type      |   Description    |
Name    |    String         | Taking input as a name from the user
amt     |    Double         | Taking input as a amt for amount from the user
type    |    Char           | Taking input as a type for taking the type of purchase from the user
disc    |    Double         | Taking variable as a disk for the discunt variable for the purchase
netAmt  |    Double         | Taking variable as a netAmt for the net Amount variable for the purchase.
*/