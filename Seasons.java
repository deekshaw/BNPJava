import java.util.Scanner;

class Seasons{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Seasons");

		System.out.println("Enter a number between 1-12 : ");
		
		int number = sc.nextInt();

		switch(number){
			
			case 1:
				System.out.println("WINTER");
				break;

			case 2:
				System.out.println("WINTER");
				break;

			case 3:
				System.out.println("SPRING");
				break;

			case 4:
				System.out.println("SPRING");
				break;

			case 5:
				System.out.println("SPRING");
				break;

			case 6:
				System.out.println("SUMMER");
				break;
			case 7:
				System.out.println("SUMMER");
				break;

			case 8:
				System.out.println("SUMMER");
				break;

			case 9:
				System.out.println("AUTUMN");
				break;

			case 10:
				System.out.println("AUTUMN");
				break;

			case 11:
				System.out.println("AUTUMN");
				break;

			case 12:
				System.out.println("WINTER");
				break;

			default:
				System.out.println("No such Season");
		}
	}
}