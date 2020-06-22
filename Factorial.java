import java.util.Scanner;

class Factorial {

	public static void main( String[] args) {
		
		System.out.println("Enter an input : ");
		
		int fact = new Scanner(System.in).nextInt();
		int factorial = 1;
		
		for( int i = fact; i >= 1; i-- )
		{
			
			factorial = factorial * i;
		}
		
		System.out.println("The factorial of number " + fact + " is: "+ factorial);
	}
}
