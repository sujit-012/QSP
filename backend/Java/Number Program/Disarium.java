import java.util.Scanner;
class Disarium 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		if(num >= 0 && num <= 9)
		{
			System.out.print(num + " is Disarium number ");
		}
		else
		{
			int count = 0;
			
			for(int i = num; i != 0; i /= 10)
			{
				count++;
			}
			
			int sum = 0;
			
			for(int i = num; i != 0; i /= 10)
			{ 
				int last = i % 10;
				
				int pow = 1;
				
				for(int j = 0; j < count; j++)
				{
					pow = pow * last;
				}
				
				sum = sum + pow;
				count--; 
			}
			
			if(sum == num)
			{ 
				System.out.println(num + " is Disarium number");
			}
			else
			{
				System.out.println(num + " is not Disarium number");
			}
		}
	}
}
