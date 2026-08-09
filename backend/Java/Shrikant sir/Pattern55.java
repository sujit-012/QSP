import java.util.Scanner;
class Pattern55 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of rows : ");
		int n = sc.nextInt();
		
		int a = (n <= 7) ? 2 : n/4;

		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == 1 || i == n || j == 1 || j == n || j == a || j == (3 * n) / 4 || i == j && j >= a && j <= 3*n/4)
				{
					System.out.print("*" + " ");
				}
				else
				{
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
	}
}
