import java.util.Scanner;
class Pattern22 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of rows : ");
		int n = sc.nextInt();
		
		int a = 1;
		char b = 'a';
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i >= j)
				{
					System.out.print(b++ + "  ");
					
				}
				else
				{
					System.out.print(a++ + " ");
					if(a <= 10) System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
