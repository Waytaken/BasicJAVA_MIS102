import java.util.Scanner;
class Soru5 {

	/**Write the JAVa program that displays the electricity invoice amount according to the first 
	 * and last index values entered from the keyboard. (Electricity unit price is 0.159838 TL.)
		Example:
		Enter the first index: 17961
		Enter the last index: 18146
		-------------------------
		Consumption amount (Last index - first index): 185
		Consumption amount: 29.57
		VAT (22%): 6.494
		-------------------------
		TOTAL: 36.064    */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double findex, lindex, cons, price, vat, total;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the first index please:");
		findex=input.nextDouble();
		
		System.out.println("Enter the last index please:");
		lindex=input.nextDouble();
		
		cons = lindex - findex;
		System.out.println("The Consumption amount is "+cons);
		
		price = cons * 0.159838;
		System.out.println("The Consumption cost is "+ Math.round(price * 100) / 100.0);
		
		vat= price * 0.22;
		System.out.println("VAT (22%) is "+ Math.round(vat * 100) / 100.0);
		
		total = vat + price;
		System.out.println("TOTAL "+ Math.round(total * 100) / 100.0);
		
	}

}
