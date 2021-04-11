import java.util.Scanner;
class Soru3 {

	/**In admissions to military high schools, the age of the candidate should be between 13 - 17 (including lower and upper limit) 
	 * and body mass index should be in the range of 18.50 - 24.99 (including lower and upper limit). 
	 * (Body mass index is calculated by dividing weight by the square of height in meters. BMI = weight / height2). 
	 * Write the JAVa program on the screen that will show whether the candidate will be admitted to military high school according to 
	 * age, weight and height information entered on the keyboard.
		EXAMPLE:
		Enter your age: 15 
		Enter your weight (kg): 75
		Enter your height (m): 1.78
		-------------------------
		Your body mass index: 23.67
		Congratulations you can enter military high school */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		double weight, height, BMI;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your age please:");
		age=input.nextInt();
		
		System.out.println("Enter your weight (kg) please:");
		weight=input.nextDouble();
		
		System.out.println("Enter your height (m) please:");
		height=input.nextDouble();
		
		BMI=weight/(height*height);
		System.out.println("Your BMI:" +Math.round(BMI * 100) / 100.0);
		
		if (BMI>= 18.50 && BMI<=24.99 && age>=13 && age<=17) {
			System.out.println("Congratulations you can enter the military high school!");
		}
		else {
			System.out.println("Unfortunately you cannot enter the military high school!");
		}
	
	}
}
