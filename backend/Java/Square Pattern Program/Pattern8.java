import java.util.Scanner;
class Pattern8 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of rows : ");
		int n = sc.nextInt();
		
		int a = 1;
		char b = (char) ('a' + (n*n)/2 - 1);
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(j % 2 == 0)
				{
					System.out.print(b-- + " ");
				}
				else
				{
					System.out.print(a++ + " ");
				}
			}
			System.out.println();
		}
	}
}
