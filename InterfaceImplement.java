interface Mobile{
	void call();
	void message();
	void listenToMusic();
}

interface Smartphone extends Mobile{
	void browseInternet();
	void playGames();

	default void fingerprintLock(){

	} 
}

class smartphoneBrand implements Smartphone{
	@Override
	public void call(){
		System.out.println("This phone can be used to make calls.");
	}

	@Override
	public void message(){
		System.out.println("This phone can be used to send a message.");
	}

	@Override
	public void listenToMusic(){
		System.out.println("This phone can be used to listen to music.");
	}

	@Override
	public void browseInternet(){
		System.out.println("This phone can be used to browse the Internet.");
	}

	@Override
	public void playGames(){
		System.out.println("This phone can be used for playing Games.");
	}

	//Overriding the new default method that was added later
	@Override
	public void fingerprintLock(){
		System.out.println("This phone can be unlocked using your fingerprint.");
	}
}

class InterfaceImplement{
	public static void main(String args[]){
		
		smartphoneBrand sb = new smartphoneBrand();

		//Calling a method
		sb.playGames();

		//Calling method added to the interface later
		sb.fingerprintLock();
	}
}