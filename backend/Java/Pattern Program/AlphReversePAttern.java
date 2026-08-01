import java.util.Scanner;
class AlphReversePattern 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of rows : ");
		int n = sc.nextInt();
		
		char ch = (char) ('a' + n*n - 1);
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print(ch-- + " ");
				if(ch < 9) System.out.print(" ");
			}
			System.out.println();
		}
	}
}
