import java.util.Scanner;
class Soru11 {

	/** Code a complete JAVA program that performs the following operations by reading 
	 *  the weight of athletes until a zero is entered on the keyboard.
		When a negative value is entered by mistake from the keyboard, it should ask to enter the value again.
    	-  How many athlete weights have been entered,
		-  Average weight of all athletes,
		-  Programmer must find out how many athletes are in each weight.
		
		Weight                                
		weight <50            Lightweight
		50≤ kg <70            Middleweight
		Higher                Heavyweight
		
		SAMPLE RUN											weight, lw, mw, hw, count
		Enter weight: 30
		Enter weight: 65
		Enter weight: 90
		Enter weight: 120
		Enter weight: 0
		-------------------------------------
		There are 1 light, 1 medium and 2 heavy weights    */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double weight, count, average, lw, mw, hw, totalweight;
		lw = 0;
		mw = 0;
		hw = 0;
		totalweight = 0;
		
		System.out.println("Enter all weights and finish with 0: ");
		Scanner input = new Scanner(System.in);

		    while ((weight = input.nextDouble()) != 0) {
		    	totalweight = totalweight + weight;
		    	
		    	if (weight >0)
		    	{
		    	
		        if (weight <50)
		            lw++;
		        
		        if (weight >=50 && weight <70)
		            mw++;
		        
		        else
		            hw++;
		    	}
		  }
		    
		    count = lw + mw + hw;
		    average = totalweight/count;
		    
		    System.out.println("The average weight is: "+(Math.round(average * 100) / 100.0));
		    System.out.println("There are "+count+" athletes.");
		    System.out.println("There are " +lw+" light, "+mw+ " medium and "+hw+" heavy weights");

	}
}
