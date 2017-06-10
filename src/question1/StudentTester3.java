package question1;

import java.util.Scanner;

public class StudentTester3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Student exams[] = new Student[3];
		
		int choice;
		
		for(int x =0; x<exams.length; x++){
		System.out.println("Enter 1 for UnderGrad; 2 for PostGrad");
		choice = input.nextInt();
		
		switch(choice) {
		
		case 1:
			UnderGrad stud1 = new UnderGrad();
			exams[x] = new UnderGrad();
			exams[x] = stud1;
			input.nextLine();
			System.out.println("Please Enter Your Name: ");
			stud1.setName(input.nextLine());
			System.out.println("Please Enter Your ID: ");
			stud1.setID(input.nextInt());
			
			for (int i = 0; i<exams.length; i++) {
				System.out.println("Enter Test " + (i+1) + " Result: ");
				stud1.setTestScore(i, input.nextInt());
			}
			System.out.print("\n");
			stud1.calculateResult();
			System.out.print("\n");
			break;
		
		case 2:
			PostGrad stud2 = new PostGrad();
			exams[x] = stud2;
			input.nextLine();
			System.out.println("Please Enter Your Name: ");
			stud2.setName(input.nextLine());
			System.out.println("Please Enter Your ID: ");
			stud2.setID(input.nextInt());
			
			for (int i = 0; i<exams.length; i++) {
				System.out.println("Enter Test " + (i+1) + " Result: ");
				stud2.setTestScore(i, input.nextInt());
			}
			System.out.print("\n");
			stud2.calculateResult();
			System.out.print("\n");
			break;
		}
		}
		
		input.close();

	}

}
