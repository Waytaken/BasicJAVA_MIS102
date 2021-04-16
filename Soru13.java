class Soru13 {

	/** Among all three (3) digit numbers; There are some special numbers 
	 * where the sum of the cubes of the numbers that make up it is equal to itself. 
	 * The number 153 is one of these special numbers. 
	 * Find out all 3-digit numbers with this feature and how many they are in total 
	 * and write the program that displays it on the screen.
		
		153 = 1^3 + 3^3 + 5^3
		Example Run:
		The queried numbers: XXX, XXX, ..., XXX,
		There are X three-digit numbers with this feature.       */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int digit, a, b, c, x;
		x =0;
	
		for(int i = 100; i <=999; i++) {

				a= i % 10;
				b= i / 10 % 10;
				c= i /100 % 10;
				digit= (a*a*a)+(b*b*b)+(c*c*c);
		
			if (i == digit) {
				x++;
				
				System.out.println("The queried numbers are: " + i);
				}
			}
		
	System.out.println("There are "+ x +" three-digit numbers with this feature."); 	
		}	
	}