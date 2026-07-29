import java.util.Scanner;
class CountOfArmstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Starting number : ");
		int start = sc.nextInt();
		
		System.out.print("Enter a ending number : ");
		int end = sc.nextInt();
		
		int count = 0;
		
		while(start <= end)
		{
			if(start >= 0 && start <= 9)
			{
				count++;
			}
			else
			{
				int count1 = 0;
				
				for(int i = start; i != 0; i /= 10)
				{
					count1++;
				}
				
				int sum = 0;
				
				for(int i = start; i != 0; i /= 10)
				{
					int last = i % 10;
					int pow = 1;
					
					for(int j = 0; j <count1; j++)
					{
						pow = pow * last;
					}
					
					sum = sum + pow;
				}
				
				if(sum == start)
				{
					count++;
				}
			}
			
			start++;
		}
		
		System.out.println("Total number of Armstrong number in between " + start + " and " + end + " is " + count);
	}
}
