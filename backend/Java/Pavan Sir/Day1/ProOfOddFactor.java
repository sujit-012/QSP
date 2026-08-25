import java.util.Scanner;
class ProOfOddFactor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int pro = 1;
		
		for(int i = 1; i <= num; i++)
		{
			if(num % i == 0 && i % 2 != 0)
			{
				pro *= i;
			}
		}
		
		System.out.println("Product of all odd factor of " + num + " is " + pro);
	}
}
