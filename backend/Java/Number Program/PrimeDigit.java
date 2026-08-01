import java.util.Scanner;
class PrimeDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a numbere : ");
		int num = sc.nextInt();
		
		boolean isPrime = true;
		
		if(num == 0) isPrime = false;
		
		while(num != 0)
		{
			int last = num % 10;
			
			if(last == 0 || last == 1 || last == 4 || last == 6 || last == 8 || last == 9)
			{
				isPrime = false;
				break;
			}
			
			num = num /	10;
		}
		
		if(isPrime)
		{
			System.out.println("All the digits of number is prime ");
		}
		else
		{
			System.out.println("All the digits of number is not a prime number");
			
		}
	}
}
