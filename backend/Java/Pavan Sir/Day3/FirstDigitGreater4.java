import java.util.Scanner;
class FirstDigitGreater4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		while(num > 0)
		{
			int dig = num%10;
			
			if(dig > 4)
			{
				System.out.println(dig);
				break;
			}
			num /= 10;
		}
	}
}

