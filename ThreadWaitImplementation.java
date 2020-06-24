class ThreadWaitImplementation {

	public static void main(String args []) throws InterruptedException{
		ThreadExec task1 = new ThreadExec();

		Thread thread1 = new Thread(task1);
		
		thread1.start();
		
		synchronized(task1) {
			task1.wait(10000);
		}
		
		System.out.println("Product : " + task1.product);
		
	}	

}

class ThreadExec implements Runnable {
	int product = 1;

	@Override
	public synchronized void run(){
		for(int i = 1 ; i < 10 ; i++){
			product *= i;
		}

		this.notify();
	}

}