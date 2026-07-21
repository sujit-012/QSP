import java.util.Scanner;
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int den = 1; den <= num/2; den++)
		{
			if(num % den == 0)
			{
				sum = sum + den;
			}
		}
		
		if(sum == num)
		{
			System.out.println("Number is Perfect number");
		}
		else
		{
			System.out.println("Number is not a perfect number");
		}
	}
}
