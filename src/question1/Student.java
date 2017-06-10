/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
package question1;

//Creating an abstract class 'Student'
public abstract class Student {
	
	//creating private variables
	private String name;
	private long id;
	private String grade;
	private int[] test;
	private final static int NUM_TESTS = 3;

	//Creating default Constructor
	public Student() 
	{
		name = "";
		id = 0;
		test = new int[3];
	}
	
	//Creating Constructor
	public Student(String name, long id) {
		this.name = name;
		this.id = id;
		
	}
	//Creating getter for name
	public String getName() {
		return name;
	}
	
	//creating setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	//Creating getter for id
	public long getID() {
		return id;
	}
	
	//creating setter for id
	public void setID(long id) {
		this.id = id;
	}
	
	//Creating getter for grade
	public String getGrade() {
		return grade;
	}
	
	//creating setter for grade
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	//Creating getter for test
	public int getTestScore(int index) {
		return this.test[index];
	}
	
	//creating setter for test
	//passing in index location with first int and then the int value at that location
	public void setTestScore(int indexlocation , int value) {
		this.test[indexlocation] = value;
	}
	
	//Creating getter for NUM_TESTS
	public static int getNumTests() {
		return NUM_TESTS;
	}
	
	//Overriding toString method
	public String toString() {
		return "Student name is: " + getName() + "\nStudent ID is: " + getID() + "\nStudent Grade is: " + getGrade();
	}
	
	//Creating abstract calculateResult method
	public abstract void calculateResult();
		
} //end class

