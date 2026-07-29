import java.util.Scanner;
class PowerDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int temp = num;
		int count = 0;
		
		while(temp != 0)
		{
			count++;
			temp = temp / 10;
		}
		
		int sum = 0;
		
		while(num != 0)
		{
			int dig = num % 10;
			
			int ans = 1;
			for(int i = 1; i <= count; i++)
			{
				ans = ans * dig;
			}
			
			sum = sum + ans;
			
			num = num / 10;
		}
		
		System.out.println(sum);
	}
}
