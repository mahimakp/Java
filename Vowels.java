import java.util.Scanner;

class Vowels{

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the string : ");

		String str = s.nextLine();

		int len = str.length();

		int vowelCount = 0;

	    for( int i = 0; i < len; i++ ) {
         
        	if ( str.charAt(i) == 'a' || 
        		 str.charAt(i) == 'e' || 
        		 str.charAt(i) == 'i' || 
        		 str.charAt(i) == 'o' || 
        		 str.charAt(i) == 'u') {
            		
            	vowelCount = vowelCount + 1;
         }

     	}

   	    System.out.println("No. of vowels in statement are " + vowelCount);
	
	}	
}