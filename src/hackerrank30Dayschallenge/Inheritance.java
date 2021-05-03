package hackerrank30Dayschallenge;

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends Person {
	private int[] testScores;

	public Student(String firstName, String lastName, int id, int[] testScores2) {
		super(firstName, lastName, id);
		this.testScores = testScores2;
	}

	public char calculate() {
		int n = 0;
		int add = 0;
		
		while(n<testScores.length) {
			add += testScores[n];
			n++;
		}
		int avg = add/testScores.length;
		if(avg >= 90){
			return 'O'; // Outstanding
		}
		else if(avg >= 80){
			return 'E'; // Exceeds Expectations
		}
		else if(avg >= 70){
			return 'A'; // Acceptable
		}
		else if(avg >= 55){
			return 'P'; // Dreadful
		}
		else if(avg >= 40){
			return 'D'; // Dreadful
		}
		else{
			return 'T'; // Troll
		}
		
	}

}

class Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}