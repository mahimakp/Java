class MethodsDemo{

	int firstNum, secondNum;

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		MethodsDemo method = new MethodsDemo();
		//MethodsDemo method1 = new MethodsDemo();

		method.takeInput(scan.nextInt(),scan.nextInt());
		//method1.takeInput(scan.nextInt(),scan.nextInt()); 

	}

	void add(int firstNum, int secondNum){

		int result = firstNum + secondNum;
		displayOutput(result);

	}

	void takeInput(int firstNum, int secondNum){
		
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		add(firstNum, secondNum);
	}

	void displayOutput(int result){
		System.out.println("Addition : " + result);
	}

}


	