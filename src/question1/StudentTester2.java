package question1;

import java.util.Scanner;

public class StudentTester2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Student exams[] = new Student[3];
		
		
		UnderGrad stud1 = new UnderGrad();
		exams[0] = stud1;
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
		
		
		
		PostGrad stud2 = new PostGrad();
		exams[1] = stud2;
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
		
		
		
		UnderGrad stud3 = new UnderGrad();
		exams[2] = stud3;
		input.nextLine();
		System.out.println("Please Enter Your Name: ");
		stud3.setName(input.nextLine());
		System.out.println("Please Enter Your ID: ");
		stud3.setID(input.nextInt());
		
		for (int i = 0; i<exams.length; i++) {
			System.out.println("Enter Test " + (i+1) + " Result: ");
			stud3.setTestScore(i, input.nextInt());
		}
		System.out.print("\n");
		stud3.calculateResult();
		System.out.print("\n");
		
		
		input.close();
	}
	
}
