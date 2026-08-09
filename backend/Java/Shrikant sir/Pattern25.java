import java.util.Scanner;
class Pattern25 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of rows : ");
		int n = sc.nextInt();
		
		int num = 2;
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print(num + " ");
				if(num <= 9) System.out.print(" ");
				
				num = num + 2;
			}
			System.out.println();
		}
	}
}
