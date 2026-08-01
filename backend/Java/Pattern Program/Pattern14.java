import java.util.Scanner;
class Pattern14 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of rows : ");
		int n = sc.nextInt();
		
		System.out.print("Enter a frame border : ");
		int k = sc.nextInt();
		
		for(int i  = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i <= k || j <= k || j >= n-k+1 || i >= n-k+1)
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
