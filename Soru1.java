import java.util.Scanner;
class Soru1 {

	/** For an invoice calculation program, write the JAVA program that calculates the amount of VAT 
	 * and the price of goods or services excluding VAT, according to the VAT rate 
	 * and the total amount including VAT entered on the keyboard. 
		Total = price * (1+VAT%)  */
	
	
	public static void main(String args[]) {
	
	double vat;
	double vatRate;
	double total;
	double price;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the total price (incl.VAT) pleas: ");
	total = input.nextDouble();
	
	System.out.println("Enter the VAT rate pleas: ");
	vatRate = input.nextDouble();
	
	price=total/(1+vatRate);
	System.out.println("The price excluding Vat is:"+Math.round(price * 100) / 100.0+ "$");
	
	vat=total-price;
	System.out.println("The value of the VAT rate is:"+Math.round(vat * 100) / 100.0+"$");
	
}
}