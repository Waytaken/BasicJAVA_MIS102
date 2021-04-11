import java.util.Scanner;
class Soru2 {

	/** Assume that the 4-digit numbers that are equal to the square of the sum of the numbers 
	 * divided into two from the middle are called Semisquare Numbers. 
	 * Write the program that says whether a 4-digit number entered from the keyboard is a Semisquare Number. 
	 * For example, the number 2025 is a semi-square number. When split in two, the numbers 20 and 25 are revealed
		20 + 25 = 45
		45^2 = 2025.
		Example 1:
		Enter the four-digit number: 9801
		------------------------------------
		The number entered is a semi-square number */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		int sum;
		int digit;
		int digit2;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the four-digit-number please:");
		digit=input.nextInt();
		
		num1 = digit/100;
		num2 = digit%100;
		
		sum = num1 + num2;
		
		digit2 = sum*sum;
		
		if (digit==digit2){
			System.out.println("The number is a semi-spuare number!");
		}
		else {
			System.out.println("The number is NOT a semi-square number!");
		}
	}
}
