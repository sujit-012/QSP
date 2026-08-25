import java.util.Scanner;
class Factors 
{
	static int num;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		
		factors();
	}
	
	public static void factors()
	{
		for(int i = 1; i <= num; i++)
		{
			if(num % i == 0)
			{
				System.out.println(i);
			}
		}
	}
}
