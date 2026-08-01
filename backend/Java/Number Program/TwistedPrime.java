import java.util.Scanner;
class TwistedPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		if(num <= 1)
		{
			System.out.println(num + " is a not a twisted prime number ");
		}
		else
		{
			boolean isPrime = true;
			
			for(int i = 2; i <= num / 2; i++)
			{
				if(num % i == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
			{
				if(num <= 9)
				{
					System.out.println(num + " is a twisted prime number ");
				}
				else
				{
					int rev = 0;
					
					int temp = num;
					
					while(temp != 0)
					{
						rev = rev * 10 + temp % 10;
						temp = temp / 10;
					}
					
					boolean isRevPrime = true;
					
					for(int i = 2; i <= rev / 2; i++)
					{
						if( rev % i == 0)
						{
							isRevPrime = false;
							break;
						}
					}
					
					if(isRevPrime)
					{
						System.out.println(num + " is a twisted prime number ");
					}
					else
					{
						System.out.println(num + " is not a twisted prime number ");
					}
				}
			}
			else
			{
				System.out.println(num + " is not a twisted prime number ");
			}
		}
	}
}
