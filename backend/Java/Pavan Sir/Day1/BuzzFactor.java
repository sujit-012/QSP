import java.util.Scanner;
class BuzzFactor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++)
		{
			if(num % i == 0 && (i % 7 == 0 || i % 10 == 7))
			{
				System.out.println(i);
			}
		}
	}
}
