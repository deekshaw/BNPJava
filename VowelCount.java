import java.util.Scanner;

class VowelCount{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String : ");
		String checkString = sc.nextLine();

		checkString = checkString.toLowerCase();

		int length = checkString.length();

		int vowelCount = 0;

		for(int i = 0; i < length; i++){

			char checkChar = checkString.charAt(i);

			if(checkChar == 'a' || checkChar == 'e' || checkChar == 'i' || checkChar == 'o' || checkChar == 'u' )
				vowelCount += 1;
			else
				continue;
		}

		System.out.println("Number of vowels : " + vowelCount);
	}
}