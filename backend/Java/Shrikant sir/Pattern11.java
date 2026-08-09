import java.util.Scanner;
class Pattern11 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		int num = n * n * n;
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print(num + " ");
				if(num <= 9) System.out.print(" ");
				
				num = num - n;
			}
			System.out.println();
		}
	}
}
