import java.util.Scanner;
class Prime2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		if(num <= 1)
		{
			System.out.println("Number is not a prime number");
		}
		else
		{
			boolean isPrime = true;
		
			for(int i = 2; i < num; i++)
			{
				if(num % i == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
			{
				System.out.println("Number is a prime number");
			}
			else 
			{
				System.out.println("Number is not a prime number ");
			}
		}
	}
}
