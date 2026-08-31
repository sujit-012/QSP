import java.util.Scanner;
class CountPrimeDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int count = 0;
		
		while(num > 0)
		{
			int dig = num % 10;
			if(dig == 2 || dig == 3 || dig == 5 || dig == 7)
			{
				count++;
			}
			
			num /= 10;
		}
		
		System.out.println(count);

	}
}
