import java.util.Scanner;
class Prime1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		if(num <= 1)
		{
			System.out.println("Number is not prime number ");
		}
		else
		{
			int count = 0;
		
			for(int i = 2; i < num; i++)
			{
				if(num % i == 0)
				{
					count++;
					break;
				}
			}
			
			if(count == 0)
			{
				System.out.println("Number is a prime number");
			}
			else
			{
				System.out.println("Number is not a prime number");
			}
		}
	}
}
