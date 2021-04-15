import java.util.Scanner;
class Soru7 {

	/** Write the program that finds the total fuel cost of the vehicle according to
	 *  the amount of fuel spent per km entered on the keyboard, 
	 *  the price per liter of fuel and the total km made by the vehicle.
		Example:
		Fuel consumption per km (lt) 0.1
		Price of 1 liter of fuel (YTL) 2.080
		The total distance covered by the vehicle (km) 1000
		---------------------------------
		Total fuel cost 208 YTL */

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cons, price, dist, con_dist, total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter fuel consumption per km (lt): ");
		cons=input.nextDouble();
		
		System.out.println("Enter price of 1 Liter of fuel (TL): ");
		price=input.nextDouble();
		
		System.out.println("Enter the total distance covered by the vehicle (km): ");
		dist=input.nextDouble();
		
		con_dist = cons * dist;
		
		total = con_dist * price;
		
		System.out.println("The total fuel cost is " +Math.round(total * 100) / 100.0);		
	}

}
