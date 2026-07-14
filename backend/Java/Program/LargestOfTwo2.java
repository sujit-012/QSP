import java.util.Scanner;
class LargestOfTwo2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first number : ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter a second number : " );
		int n2 = sc.nextInt();
		
		String result = (n1 > n2) ? n1 + " is greater than " + n2 : n2 + " is greater than " + n1;
		
		System.out.println(result);
	}
}
