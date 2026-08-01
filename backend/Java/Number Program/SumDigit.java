import java.util.Scanner;
class SumDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num > 0)
		{
			int last = num % 10;
			
			sum = sum + last;
			
			num = num / 10;
		}
		
		System.out.println("Sum of all the digit of number is " + sum);
	}
}
