import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		if(num / 7 == 0 || num % 10 == 7)
		{
			System.out.println("Number is Buzz number!");
		}
		else
		{
			System.out.println("Number is not Buzz number!");
		}
	}
}
