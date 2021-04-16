class Soru14 {

	/** The number 2025 is an interesting number. 
	 * That is to say;
                        20 + 25 = 45
                            452 = 2025
                            
		Code the program in JAVa to find the 4-digit numbers with this feature 
		and display them (including 2025).
		Example:
		Numbers XXXX, XXXX, XXXX, ... XXXX, Total = X pieces  */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		int digit;
		int x = 0;
		
		for(int i = 1000; i <=9999; i++) {

			num1 = i/100;
			num2 = i%100;
			digit = (num1+num2)*(num1+num2);
	
				if (i == digit) {
					x++;
			System.out.println("The queried numbers are: " + i);
			}
		}
		System.out.println("There are "+ x +" four-digit numbers with this feature.");
	}
}