import java.util.Scanner;
class TwinPrime
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter a second number : ");
		int num2 = sc.nextInt();
		
		if(num1 - num2 == 2 || num1 - num2 == -2)
		{
			boolean isPrime = true;
			
			for(int i = 2; i <= num1/2; i++)
			{
				if(num1 % i == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			for(int i = 2; i <= num2/2; i++)
			{
				if(num2 % i == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) System.out.println("Twin Prime");
			else System.out.println("Not Twin Prime");
		}
		else System.out.println("Not Twin Prime");
	}
}
