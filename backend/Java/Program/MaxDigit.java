import java.util.Scanner;
class MaxDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int max = 0;
		
		while(num != 0)
		{
			int last = num % 10;
			if(last > max)
			{
				max = last;
			}
			
			num = num / 10;
		}
		
		System.out.println("Max digit of a number is " + max);
	}
}
