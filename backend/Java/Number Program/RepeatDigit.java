import java.util.Scanner;
class RepeatDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number ");
		int num = sc.nextInt();
		
		System.out.print("Enter a digit : ");
		int digit = sc.nextInt();
		
		if(digit < 0 || digit > 9)
		{
			do
			{
				System.out.println("Enter a valid digit between 0 - 9!!");
				System.out.print("Enter a digit again : ");
				digit = sc.nextInt();
			}
			while (digit < 0 || digit > 9);
		}
		
		if(num == 0 && digit  == 0)
		{
			System.out.println(1);
		}
		else
		{
			int count = 0;
			
			while(num != 0)
			{
				int last = num % 10;
				
				if(last == digit)
				{
					count++;
				}
				
				num = num / 10;
			}
			
			System.out.println(digit + " of digits in number is " + count);
		}
	}
}
