import java.util.Scanner;
class FactDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		while(num > 0)
		{
			int dig = num % 10;
			int ans = 1;
			
			for(int i = dig; i >= 1; i--)
			{
				ans *= i;
			}
			
			System.out.println(dig + " ! = " + ans);
			num /= 10;
		}
	}
}
