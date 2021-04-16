import java.util.Scanner;

class Soru17 {

	/** Write the numbers on the screen that can be divided into 4 and 7 between 
	    the two numbers entered on the keyboard and how many they are.
		Example Run:
		Enter the first number: 20
		Enter the second number: 100
		-----------------------------
		28, 56, 84,
		3 pieces in total        */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int i, start, end, even, evenCounter;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println(" Enter starting and ending value please: ");
		start = input.nextInt();
		end = input.nextInt();
		
		evenCounter=0;
		
		System.out.print("The related numbers are: ");
		
		for (i=start; i<=end; i++) {
			if (i%4 ==0 && i%7 ==0) {
				
				System.out.print(i+" ");  
				evenCounter++;
			}
		}
		
		System.out.println("\nThere are "+ evenCounter +" numbers in total.");
	}
}
