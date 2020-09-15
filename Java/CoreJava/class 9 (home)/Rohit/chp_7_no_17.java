import java.util.Scanner;
public class chp_7_no_17
{
public static void main (String args [])
 {
Scanner in = new Scanner(System.in);
System.out.println("1. Ground floor");
System.out.println("2. First floor");
System.out.println("3. Second floor");
System.out.println("4. Third floor");
System.out.print("Select a floor: ");
int floor = in.nextInt();
boolean isFloorValid = true;
switch (floor)
 {
case 1:
System.out.println("Kids Wear");
break;
case 2:
System.out.println("Ladies Wear");
break;
case 3:
System.out.println("Designer Sarees");
break;
case 4:
System.out.println("Men's Wear");
break;
default:
isFloorValid = false;
System.out.println("Incorrect Floor");
break;
}
if (isFloorValid) {
System.out.print("Enter bill amount: ");
double amt = in.nextDouble();
System.out.println("Name of the Shop: City Mart");
System.out.println("Total Amount: " + amt);
System.out.println("Visit Again!!");
}
}
}