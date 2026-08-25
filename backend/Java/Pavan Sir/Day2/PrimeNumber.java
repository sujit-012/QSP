import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num : ");
		int num = sc.nextInt();
		
		boolean isPrime = true;
		
		for(int i = 2; i <= num/2; i++)
		{
			if(num % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)
		{
			System.out.println(num + " is prime number");
		}
		else
		{
			System.out.println(num + " is not prime number");
		}
	}
}
