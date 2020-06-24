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

				System.out.print(" \r " + var);

				Thread.currentThread().sleep(1000);
				
				var++;
			}
			catch(InterruptedException ie){

				System.out.println("InterruptedException");
			}
		}
	}
}
