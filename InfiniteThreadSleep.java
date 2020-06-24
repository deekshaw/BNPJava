class InfiniteThreadSleep extends Thread{
	public static void main(String args[]){
		InfiniteThreadSleep ref = new InfiniteThreadSleep();
		InfiniteThreadSleep ref1 = new InfiniteThreadSleep();

		ref.start();
	}

	@Override
	public void run(){
		try{
			for(int i = 0; i < 10; i++){
				System.out.print(i + "\r");
				Thread.sleep(2000);	
			}
		}
		catch(InterruptedException ie){
			System.out.println("Interrupted");
		}
		
	}
}