class AdditionUsingInstanceVariables{
	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		System.out.println("Enter 2 numbers : ");

		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();
		
		new AdditionUsingInstanceVariables().takeInput(firstNum, secondNum);
	}


	void add(int firstNum, int secondNum){
		int result = firstNum + secondNum;
		displayOutput(result);
	}

	void takeInput(int firstNum, int secondNum){
		add(firstNum, secondNum);
	}

	void displayOutput(int result){
		System.out.println("Addition : " + result);
	}




}