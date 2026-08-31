import java.util.Scanner;
class PowerOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int count = 0;
		for(int i = num; i > 0; i /= 10)
		{
			count++;
		}
		
		while(num > 0)
		{
			int dig = num % 10;
			int pow = 1;
			
			for(int i = 1; i <= count; i++)
			{
				pow *= dig;
			}
			
			System.out.println(pow);
			num /= 10;
		}
	}
}
