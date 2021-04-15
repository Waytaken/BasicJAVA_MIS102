import java.util.Scanner;
class Soru9 {

	/** After calculating the ranking score according to the ALES (Academic Postgraduate Exam) 
	 * score, foreign language score and graduation grade point average of the candidate applying 
	 * for graduate education, write the program in JAVA, which will be able to enter the 
	 * ranking on the screen. (All points are given over a hundred.)
	 * 
	Ranking Score = 50% of ALES + 25% of foreign language score + 25% of graduation grade point average
	
	It is calculated by the formula above. If the ranking score is 60 and above, it can enter the ranking, otherwise it cannot.
		Example:
		Enter ALES score: 80.91
		Enter the foreign language score: 80.50
		Graduation GPA: 75.56
		-------------------------
		Your ranking score: 79.47
		May enter the rankings   */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double ales, fls, gpa, ranking;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter ALES score please: ");
		ales = input.nextDouble();
		
		System.out.println("Enter the foreign language score please: ");
		fls = input.nextDouble();
		
		System.out.println("Enter your graduation GPA please: ");
		gpa = input.nextDouble();
		
		ranking = (ales*0.5)+(fls*0.25)+(gpa*0.25); 
		System.out.println("Your ranking score is: " + ranking);
		
		if (ranking >=60) {
			System.out.println("May enter the ranking!");
		}
		else {
			System.out.println("May not enter the ranking!");
		}
	}
}
