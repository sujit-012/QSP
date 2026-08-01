import java.util.Scanner;
class RangeOfArmstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a starting number : ");
		int start = sc.nextInt();
		
		System.out.print("Enter a ending number : ");
		int end = sc.nextInt();
		
		while(start <= end)
		{
			if(start >= 0 && start <= 9)
			{
				System.out.println(start);
			}
			else
			{
				int count = 0;
				for(int i = start; i != 0; i = i / 10)
				{
					count++;
				}
				
				int sum = 0;
				
				for(int i = start; i != 0; i = i / 10)
				{
					int last = i % 10;
					int pow = 1;
					
					for(int j = 0; j < count; j++)
					{
						pow = pow * last;
					}
					
					sum = sum + pow;
				}
				
				if(sum == start)
				{
					System.out.println(start);
				}
			}
			
			start++;
		}				
	}
}
