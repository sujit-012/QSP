import java.util.Scanner;
class Pattern16 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ente a number of rows : ");
		int n = sc.nextInt();
		
		int num = 1;
		char ch = (char) ('a' + (n*n)/2 - 1);
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i%2 != 0)
				{
					System.out.print(num++ + " ");
					if(num <= 10) System.out.print(" ");
				}
				else
				{
					System.out.print(ch-- + "  ");
				}
			}
			System.out.println();
		}
	}
}
