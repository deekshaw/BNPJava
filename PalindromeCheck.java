import java.util.Scanner;
import java.lang.Math; 

class PalindromeCheck{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string : ");
		String checkPalindrome = sc.nextLine();

		checkPalindrome = checkPalindrome.toLowerCase();

		int length =  checkPalindrome.length();

		int palindromeFlag = 0;

		char firstChar = checkPalindrome.charAt(0);
		char lastChar = checkPalindrome.charAt(length-1);

		for(int i=0; i < Math.floor(length/2) ; i++){

			if(firstChar == lastChar){

				firstChar = checkPalindrome.charAt(0+(i+1));
				lastChar = checkPalindrome.charAt(length-1-(i+1));

			}
			else{

				palindromeFlag = 1;
				break;
				
			}
		}
		
		if(palindromeFlag == 1)
			System.out.println("Entered String is not a Palindrome.");
		else
			System.out.println("Entered String is a Palindrome.");
	}
}