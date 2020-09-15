
/*
A shopkeeper buys a TV set for Rs. 32,500 and sells it at a profit of 15 %. 
Apart from this a GST of 18.5% and Service Charge is 1.07% is charged. 
Display total selling price, profit along with GST and service charge.
*/

class Program4 {

	public static void main(String[] args) {
	
		int a=32500;
		
		double pro=a*(15.0/100.0);
		double sell=(32500+pro);
		double GST=sell*(18.5/100.0);
		double service = sell*(1.07/100.0);
		double Total_Selling_price=sell+GST+service;

		System.out.println("Selling price :"+sell);
		System.out.println("GST price :"+GST);
		System.out.println("Service price :"+service);
		System.out.println("Total selling price :"+Total_Selling_price);
	}

}
