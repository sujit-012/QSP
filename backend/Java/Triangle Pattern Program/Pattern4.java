import java.util.Scanner;
class Pattern4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of rows : ");
		int n = sc.nextInt();
		
		char ch = 'a';
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i >= j)
				{
					System.out.print(ch++ + " ");
				}
			}
			System.out.println();
		}
	}
}
