import java.util.Scanner;

class Palindrome {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the string : ");
		
		String str = s.nextLine();
		str = str.toLowerCase();

		String rev = "" ;

		int len = str.length();

		for (int i = len-1; i >= 0; i-- ){

			rev = rev + str.charAt(i);
		}

		if ( str.equals(rev)){

			System.out.println(str+ " is a Palindrome ");
		}
		else {

			System.out.println(str + " is not a Palindrome");
		}

	}
}