import java.util.Scanner;
class Soru10 {

	/** Write the program in JAVA that writes the even numbers and counter value 
	 * on the screen according to the starting and ending values entered as 
	 * positive integers from the keyboard. 
	 * (Starting and ending will be included if they are in pairs)
		Example:
		Enter the starting and ending value: 5 10
		The numbers are: 6, 8, 10
		3 numbers in total  */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, start, end, even, evenCounter;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println(" Enter starting and ending value please: ");
		start = input.nextInt();
		end = input.nextInt();
		
		evenCounter=0;
		
		System.out.print("The even numbers are: ");
		
		for (i=start; i<=end; i++) {
			if (i%2 ==0) {
				
				System.out.print(i+" ");  
				evenCounter++;
			}
		}
		
		System.out.println("\nThere are "+ evenCounter +" numbers in total.");
	}
}