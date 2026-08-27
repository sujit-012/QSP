import java.util.Scanner;
class StrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = num; i > 0; i /= 10)
		{
			int dig = i % 10;
			int ans = 1;
			
			for(int j = dig; j >= 1; j--)
			{
				ans *= j;
			}
			
			sum += ans;
		}
		
		if(sum == num) System.out.println(num + " is Stong number ");
		else System.out.println(num + " is not Strong number ");
	}
}
