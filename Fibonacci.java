class Fibonacci{
	public static void main(String args[]){
		System.out.println("Fibonacci Series");
		
		int numb1 = 1;
		int numb2 = 1;
		int numb = 0;

		for(int i = 1; i <= 11; i++){		
			if( i == 1 | i == 2){
				System.out.print("1 ");
			}
			else{
				numb = numb1 + numb2;
				System.out.print(numb + " ");
				numb1 = numb2;
				numb2 = numb;
			}			
		}

	}
}