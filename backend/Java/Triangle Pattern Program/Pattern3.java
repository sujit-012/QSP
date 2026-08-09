import java.util.Scanner;
class Pattern3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of rows : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i >= j)
				{
					System.out.print(i + " ");
					if(i <= 9) System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
