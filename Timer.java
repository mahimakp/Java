class Timer extends Thread{

	public static void main(String[] args) {
		
		Timer thread = new Timer();

		thread.start();
	}

	@Override
	public void run(){

		int var = 0; 
		
		while (var>=0){
			try{

				Thread.sleep(1000);
			
				System.out.println(var);

				var++;
			}
			catch(InterruptedException ie){

				System.out.println("InterruptedException");
			}
		}
	}
}