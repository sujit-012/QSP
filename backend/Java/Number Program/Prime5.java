import java.util.Scanner;
class Prime5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int den = 2;
		
		while(den <= num/2)
		{
			if(num % den == 0)
			{
				break;
			}
			
			den++;
		}
		
		if(den > num/2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}
}
