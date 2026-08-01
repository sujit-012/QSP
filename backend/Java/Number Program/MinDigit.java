import java.util.Scanner;
class MinDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int min = 9;
		
		while(num != 0)
		{
			int last = num % 10;
			
			if(last < min)
			{
				min = last;
			}
			
			num = num / 10;
		}
		
		System.out.println("Min Digit of a number is " + min);
	}
}
