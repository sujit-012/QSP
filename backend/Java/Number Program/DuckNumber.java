import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		if (num <= 0)
		{
			System.out.println("Number is not a duck number");
		}
		else
		{
			boolean isDuck = false;
			while(num != 0)
			{
				if(num % 10 == 0)
				{
					isDuck = true;
				}
				num /= 10;
			}
			
			if(isDuck)
			{
				System.out.println("Number is a duck number ");
			}
			else
			{
				System.out.println("Number is not a duck number");
			}
		}
	}
}
