class Student{

	long prnNumber;
	int year, cetScore;
	String name, branch;

	//Contructor - Sets values of parameters at the time of initialization
	Student(long prnNumber, int year){
		this.prnNumber = prnNumber;
		this.year = year;
	}

	Student(int year){
		this.year = year;
	}

	//Setting values of other Parameters
	void setName(String name){
		this.name = name;
	}

	void setBranch(String branch){
		this.branch = branch;
	}

	void setCetScore(int cetScore){
		this.cetScore = cetScore;
	}

	long getPrnNumber(){
		return this.prnNumber;
	}

	int getYear(){
		return this.year;
	}

	String getName(){
		return this.name;
	}

	String getBranch(){
		return this.branch;
	}

	int getCetScore(){
		return this.cetScore;
	}
}

class StudentEnrollmentUsingContructor{
	//Parameterized Constructor

	public static void main(String args[]){

		//PRN Number and Year of joining must be added at the time of admission
		Student student1 = new Student(1234, 2016);
		Student student2 = new Student(1235, 2016);

		//Name, Branch, CET score can be added later 
		
		//Setting Values for Student 1
		student1.setName("Aman Yadav");
		student1.setBranch("Computer Science");
		student1.setCetScore(143);

		//Setting Values for Student 1
		student1.setName("Arya Malik");
		student1.setBranch("Information Technology");
		student1.setCetScore(162);

		//Displaying Student Details
		//Student 1
		System.out.println("Student 1");
		System.out.println("PRN Number : " +student1.getPrnNumber);
		System.out.println("Name : " +student1.getName);
		System.out.println("Branch : " +student1.getBranch);
		System.out.println("Year Of Joining : " +student1.getYear);
		System.out.println("CET Score : " +student1.getCetScore);

		//Student 2
		System.out.println("Student 2");
		System.out.println("PRN Number : " +student2.getPrnNumber);
		System.out.println("Name : " +student2.getName);
		System.out.println("Branch : " +student2.getBranch);
		System.out.println("Year Of Joining : " +student2.getYear);
		System.out.println("CET Score : " +student2.getCetScore);

		//If students have not been allotted PRN numbers due to some reasons
		Student student3 = new Student(2017);

		//Student 3
		System.out.println("Student 3");
		System.out.println("Year of Joining : " +student3.getYear);
	}
}