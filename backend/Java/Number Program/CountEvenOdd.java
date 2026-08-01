import java.util.Scanner;
class CountEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		
		int num = sc.nextInt();
		
		int countEven = 0;
		
		int countOdd = 0;
		
		while(num > 0)
		{
			int last = num % 10;
			
			if(last % 2 == 0)
			{
				countEven++;
			}
			else
			{
				countOdd++;
			}
			
			num = num / 10;
		}
		
		System.out.println("Total Even numbers Present in number is " + countEven);
		System.out.println("Total Odd numbers Present in number is " + countOdd);
	}
}
