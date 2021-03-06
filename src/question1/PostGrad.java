/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
package question1;

//making PostGrad a subclass of Student(the superclass)
public class PostGrad extends Student {

	// creating default constructor
	public PostGrad() {
		super(); // calling the super constructor
	}

	// creating constructor
	public PostGrad(String name, long id) {
		super(name, id); // calling super constructor
	}

	// Overriding calculateResult method for PostGrad
	public void calculateResult() {
		// Creating int variable 'avg'
		int avg = 0;

		// getting the average of the three test scores to be inputed
		avg = ((getTestScore(0) + getTestScore(1) + getTestScore(2)) / getNumTests());

		// Setting the pass grade using if statement
		if (avg >= 50) {
			setGrade("PASS!!!");
		}

		// Setting the fail grade using else
		else {
			setGrade("Fail");
		}

		// printing out results to console by calling toString
		System.out.println(toString());
	}
} //end class
