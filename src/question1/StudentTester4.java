/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
package question1;

import java.util.Scanner; //selecting and bringing in the scanner utility

public class StudentTester4 {

	public static void main(String[] args) {
		
		//declaring and creating new instance of the scanner
		Scanner input = new Scanner(System.in);
		
		//creating array of type Student
		Student exams[] = new Student[3];
		
		//creating int variable 'choice'
		int choice;
		
		//creating for loop to loop for the length of the 'exams' Array. To be used to allow population of the Array
		for(int x =0; x<exams.length; x++){
			
			//Output for User
			System.out.println("Enter 1 if you are an Under-Grad Student; 2 if you are a Post-Grad Student:");
			choice = input.nextInt(); //setting user input to choice
		
		/*
		 * Using a switch method to allow the user to choose whether they are
		 * an UnderGrad or a PostGrad to allow for a more complete program.
		 */
		switch(choice) {
		
		//For UnderGrad choice
		case 1:
			exams[x] = new UnderGrad();
			
			input.nextLine();// to clear the input
			
			//Output to prompt user
			System.out.println("Please Enter Your Name: ");
			//setting user input to setName for index x of exam Array
			exams[x].setName(input.nextLine());
			
			//Output to prompt user
			System.out.println("Please Enter Your ID: ");
			//setting user input to setID for index x of exam Array
			exams[x].setID(input.nextInt());
			
			//Creating for loop to allow user to enter 3 different test scores
			for (int i = 0; i<exams.length; i++) {
				//Output to prompt user
				System.out.println("Enter Test " + (i+1) + " Result: ");
				//Setting user input to setTestScore
				exams[x].setTestScore(i, input.nextInt());
			}
			System.out.print("\n");
			//Calling the calculateResult method to calculate average of scores, set grade and print results
			exams[x].calculateResult();
			System.out.print("\n");
			break;
		
		//For PostGrad choice
		case 2:
			exams[x] = new PostGrad();
			
			input.nextLine();// to clear the input
			
			//Output to prompt user
			System.out.println("Please Enter Your Name: ");
			//setting user input to setName for index x of exam Array
			exams[x].setName(input.nextLine());
			
			//Output to prompt user
			System.out.println("Please Enter Your ID: ");
			//setting user input to setID for index x of exam Array
			exams[x].setID(input.nextInt());
			
			//Creating for loop to allow user to enter 3 different test scores
			for (int i = 0; i<exams.length; i++) {
				//Output to prompt user
				System.out.println("Enter Test " + (i+1) + " Result: ");
				//Setting user input to setTestScore
				exams[x].setTestScore(i, input.nextInt());
			}
			System.out.print("\n");
			//Calling the calculateResult method to calculate average of scores, set grade and print results
			exams[x].calculateResult();
			System.out.print("\n");
			break;
		
		//if neither 1 or 2 are entered by user.
		default: System.out.println("Invalid Choice");
			break;
		}
		
		} //end of for loop
		
		input.close(); //Close input to avoid possible leak

	} //end main method

} //end class
