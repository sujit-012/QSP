import java.util.Scanner;
class TwinPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first number : ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter a second number : ");
		int n2 = sc.nextInt();
		
		if(n1 - n2 == 2 || n1 - n2 == -2)
		{
			if(n1 <= 1 || n2 <= 1)
			{
				System.out.println("Numbers are not twin prime number");
			}
			else
			{
				boolean isPrime1 = true;
				boolean isPrime2 = true;
				
				for(int i = 2; i <= n1 / 2; i++)
				{
					if(n1 % i == 0)
					{
						isPrime1 = false;
						break;
					}
				}
				
				for(int i = 2; i <= n2 / 2; i++)
				{
					if(n2 % i == 0)
					{
						isPrime2 = false;
						break;
					}
				}
				
				if(isPrime1 && isPrime2)
				{
					System.out.println("Numbers are twin prime number ");
				}
				else
				{
					System.out.println("Numbes are not twin prime number ");
				}
			}
		}
		else
		{
			System.out.println("Numbers are not twin prime number ");
		}
	}
}
