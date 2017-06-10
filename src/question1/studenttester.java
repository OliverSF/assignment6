package question1;

public class studenttester {

	public static void main(String[] args) {

		Student exams[] = new Student[3];

		// UnderGrad f= new UnderGrad();
		
		
		UnderGrad stud1 = new UnderGrad();
		exams[0] = stud1;
		stud1.setName("BOB");
		stud1.setID(10101);
		stud1.setTestScore(0, 80);
		stud1.setTestScore(1, 90);
		stud1.setTestScore(2, 100);
		
		stud1.calculateResult();
		
		PostGrad stud2 = new PostGrad();
		exams[1] = stud2;
		stud2.setName("Archer");
		stud2.setID(10202);
		stud2.setTestScore(0, 40);
		stud2.setTestScore(1, 40);
		stud2.setTestScore(2, 40);
		
		stud2.calculateResult();
		
		UnderGrad stud3 = new UnderGrad();
		exams[2] = stud3;
		stud3.setName("Allana");
		stud3.setID(10303);
		stud3.setTestScore(0, 100);
		stud3.setTestScore(1, 100);
		stud3.setTestScore(2, 100);
		
		stud3.calculateResult();
		
		

	}

}
