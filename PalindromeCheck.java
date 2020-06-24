import java.util.Scanner;

class PalindromeCheck{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string : ");
		String checkPalindrome = sc.nextLine();

		checkPalindrome = checkPalindrome.toLowerCase();

		int length =  checkPalindrome.length();
		System.out.println(length);

		int palindromeFlag = 0;

		char firstChar = checkPalindrome.charAt(0);
		char lastChar = checkPalindrome.charAt(length-1);


		if(length % 2 == 0){

			for(int i=0; i < length/2 ; i++){

				if(firstChar == lastChar){
					firstChar += 1;
					System.out.println(firstChar);
					lastChar -= 1;
					System.out.println(lastChar);
				}
				else
					palindromeFlag = 1;
					break;
			}
			
		}
		else{

			for(int i=0; i < (length-1)/2 ; i++){

				if(firstChar == lastChar){
					firstChar += 1;
					lastChar -= 1;
				}
				else
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