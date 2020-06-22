import java.util.Scanner;

class Fibbonicci {

	public static void main(String[] args)
	{
		int n1=0, n2=1, count, temp;
		
		System.out.print(" Enter input : ");
		count = new Scanner(System.in).nextInt();
		
		for(int i = 2; i <= count; i++)
		{
			
			temp = n1 + n2;
			System.out.print(temp + " ");
			n1 = n2;
			n2 = temp;
			
		}
	}
}  
