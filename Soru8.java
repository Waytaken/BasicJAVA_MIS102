import java.util.Scanner;
class Soru8 {

	/** Suppose that among the four (4) digit (abcd) positive integers, those that have 
	 * the property of multiplying the first two digits and the last two digits, 
	 * equaling the product of the substituted form of their digits (ab * cd = ba * dc), 
	 * are called Inverted Numbers. 
	 * Write the program that says whether a 4-digit number entered from the keyboard is a Reverse Number.
		For example, the number 1242 is an Inverted number. 12 * 42 = 21 * 24
		EXAMPLE 1:
		Enter the four-digit number: 6213
		------------------------------------
		The number entered is an Inverted number  */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, d, ab, cd, ba, dc, digit, total1, total2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a four-digit number please: ");
		digit=input.nextInt();
		
		ab= digit/100;
		cd= digit%100;
		
		total1= ab*cd;
		
	/** first_digit = n/10 
	 *  second_digit = n%10 
	 *  swapped_number = (second_digit*10)+first_digit */
		
		a= ab/10;
		b= ab%10;
		ba= (b*10)+a;
		
		c= cd/10;
		d= cd%10;
		dc= (d*10)+c;
		
		total2= ba*dc;
		
		//System.out.println(""+ab+""+cd+"-"+ba+""+dc);  //testing whether its sweped correct
		
		if (total1 == total2) {
			System.out.println("The entered number is an inverted number!");
		}
		else {
			System.out.println("The entered number is NOT an inverted number!");
		}
	}

}
