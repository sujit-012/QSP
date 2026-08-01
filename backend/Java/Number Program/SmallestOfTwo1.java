import java.util.Scanner;
class SmallestOfTwo1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first number : ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter a second number : ");
		int n2 = sc.nextInt();
		
		if(n1 < n2)
		{
			System.out.println(n1 + " is smaller than " + n2);
		}
		else
		{
			System.out.println(n2 + " is smaller than " + n1);
		}
	}
}
