import java.util.Scanner;
class Soru15 {

	/** Nail polishes sold in a parfumery are "Red", "Green", Yellow "and" Black ". 
	 * Product codes are 1, 2, 3 and 4 respectively. 
	 * Perfumery wants to determine which color nail polish and how many pieces it sells 
	 * per day with a computer application program. The program should take product code as 
	 * input and check for errors. Enter 111 to end the journal entry.
	 * @param args
	 
		Example Run:
		Enter code (1,2,3,4 or 111 to exit): 1
		Enter code (1,2,3,4 or 111 to exit): 1
		Enter code (1,2,3,4 or 111 to exit): 5
		Error!! Please enter a valid code
		Enter code (1,2,3,4 or 111 to exit): 3
		Enter code (1,2,3,4 or 111 to exit): 111
		End of Day Sales Report:
		2 Red, 0 Green, 1 Yellow, 0 Black nail polish has been sold.    */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int red = 0;
		int green = 0;
		int yellow= 0;
		int black= 0;
		int prod;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter product code (1, 2, 3, 4 or 111 to exit) please: ");
		
		while ((prod = input.nextInt()) !=111) {
		
			if (prod == 1) {
				red++;
			}
			else if (prod == 2) {
				green++;
			}
			else if (prod == 3) {
				yellow++;
			}
			else if (prod== 4) {
				black++;
			}
			else {
				System.out.println("Error!! Please enter a valid code!");
			}
		}
			System.out.println("End of the Day Sales Report: \n" +red +" red, "+green+" green, " +yellow+" yellow, " +black+" black nail polish has been sold!");
	}
}
