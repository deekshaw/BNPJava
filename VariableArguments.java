class VariableArguments{
	int multiply(int... input){
		int product = 1;

			for(int value : input){
				product *= value;
			}

		if(product == 1){
			return 0;
		}
		else{
			return product;
		}
		
	}

	public static void main(String args[]){

		int result;

		VariableArguments v = new VariableArguments();
		
		result = v.multiply(20,10,10,10);

		if(result == 0)
			System.out.println("Need at least 2 values to calculate the product.");
		else
			System.out.println("Multiplication : " +result);
	}
}