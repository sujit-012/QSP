import java.util.Scanner;
class emirp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
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
			int rev = 0;
			for(int i = num; i > 0; i /= 10)
			{
				rev = rev * 10 + i % 10;
			}
			
			if(rev == num) System.out.println("not emirp");
			else
			{
				for(int i = 2; i <= rev/2; i++)
				{
					if(rev % i == 0)
					{
						isPrime = false;
						break;
					}
				}
				
				if(isPrime) System.out.println("emirp");
				else System.out.println("not emirp");
			}
		}
		else System.out.println("not emirp");
	}
}
