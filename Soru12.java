//import java.util.Scanner;
class Soru12 {

	/** Among all three (3) digit numbers; There are some special numbers where
	 *  the product of the numbers that make up it and the product of the sum are 
	 *  equal to itself. Number 135 is one of these special numbers. 
	 *  Find out all 3-digit numbers with this feature and how many they are in total 
	 *  and write the program that displays them on the screen.
		135 = (1 x 3 x 5) x (1 + 3 + 5)
		Example Run:
		Numbers searched: XXX, ...,
		There are X three-digit numbers with this feature.  */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int digit, a, b, c, x;
		x =0;
	
		
		for(int i = 100; i <=999; i++) {

				a= i % 10;
				b= i / 10 % 10;
				c= i /100 % 10;
				digit= (a*b*c)*(a+b+c);
		
			if (i == digit) {
				x++;
			
					System.out.println("Number searched: " + i);
				}
		}
		
			System.out.println("There are "+ x +" three-digit numbers with this feature."); 	
	}
}
