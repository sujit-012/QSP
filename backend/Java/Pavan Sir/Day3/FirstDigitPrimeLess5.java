import java.util.Scanner;
class FirstDigitPrimeLess5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		while(num > 0)
		{
			int dig = num%10;
			
			if((dig != 2 || dig != 3 || dig != 5 || dig != 7) && dig < 5)
			{
				System.out.println(dig);
				break;
			}
			num /= 10;
		}
	}
}

