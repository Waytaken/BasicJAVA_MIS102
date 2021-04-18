import java.util.Scanner;
class Soru16 {

	/** According to the starting and ending values entered on the keyboard, 
	 *  write a program that displays the numbers that can be divided 
	 *  into 3 or 11 numbers, how many they are and their totals.
		EXAMPLE RUN:
		Enter the starting value: 5
		Enter the ending value: 15
		-----------------------------
		6, 9, 11, 12, 15,
		There are 5 numbers in total that comply with the rule.  */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int start, end, count = 0;
		
		System.out.print("Enter first value please: ");
		start = input.nextInt();
		
		System.out.print("Enter last value please: ");
		end = input.nextInt();
		
		for(int i = start; i <= end; i++) {
			
			if(i%3==0 || i%11==0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.print("\nThere are " +count + " numbers in total that comply with the rule.");
	}	
}