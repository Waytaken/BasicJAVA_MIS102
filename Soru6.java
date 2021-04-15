import java.util.Scanner;
class Soru6 {

	/** In the written exam held at the end of the driving license course, 
	 * 50 questions from Traffic, 40 from Engine, 30 questions from First Aid are asked. 
	 * Passing grade in driver's license exams is 70 out of 100. 
	 * A student who scores 70 and above in each course becomes successful and becomes 
	 * eligible to take the driving exam. Calculate the scores according to 
	 * the number of mistakes entered on the keyboard and write the program 
	 * that will show whether the student can take the steering test or not.
		EXAMPLE:
		Enter the traffic wrong number: 10
		Enter the wrong number of engine: 10
		Enter first aid wrong number: 10
 		-------------------------
		Your traffic score: 80.00
		Your engine score: 75.00
		Your first aid score: 66.66
		Sorry, you cannot take the steering test  */ 
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		double Twrong, Ewrong, Fwrong, Tscore, Escore, Fscore;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the traffic wrong number please:");
		Twrong=input.nextDouble();
		
		System.out.println("Enter the wrong number of engine please:");
		Ewrong=input.nextDouble();
		
		System.out.println("Enter first aid wrong number please:");
		Fwrong=input.nextDouble();
		
		//------------
		
		Tscore = 100 - ((100/50)*Twrong);
		System.out.println("Your traffic score: " +Tscore);
		
		Escore = 100 - ((100/40)*Ewrong);
		System.out.println("Your engine score: " +Escore);
		
		Fscore = 100 - ((100/30)*Fwrong);
		System.out.println("Your first aid score: " +Fscore);
		
		//HESAPLAMA DOGRU - AMA SONUC YANLISSS ????
		// The calculation is right but the solution is wrong. No idea why. İf you have an idea feel free to contact me!
		
		if (Tscore >=70 && Escore>=70 && Fscore >=70) {
			System.out.println("Congratulations, you can take the steering test!");
		}
		else {
			System.out.println("Sorry, you cannot take the steering test!");
		}
	}
}
