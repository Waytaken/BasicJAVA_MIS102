import java.util.Scanner;
class Soru4 {

	/** Write the JAVA program to find out whether a 4-digit integer entered from 
	 * the keyboard is the number that fills its cube. When the program runs, 
	 * the example below should be suitable for work. 
	 * If the number is equal to the cube of the sum of its numbers, 
	 * assume that number is called the number that fills the cube.
		For example 5832 => 5 + 8 + 3 + 2 = 18 and 18^3 = 5832  */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int digit, num1, num2, num3, num4, digit2, sum;

		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a 4-digit number pleas:");
		digit=input.nextInt();
		
		num1= digit % 10;
		num2= digit / 10 % 10;
		num3 = digit /100 % 10;
		num4 = digit /1000% 10;
		
		sum= num1+num2+num3+num4;
		
		digit2= sum*sum*sum;
		
		if (digit==digit2){
			System.out.println("The number fills its cube!");
		}
		else {
			System.out.println("The number fills NOT its cube!");
		}
	}
}
