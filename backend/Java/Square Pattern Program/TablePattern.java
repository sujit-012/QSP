import java.util.Scanner;
class TablePattern 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of row : ");
		int n = sc.nextInt();
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int a = num;
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print(a + " ");
				if(a <= 9) System.out.print(" ");
				 a += num;
			}
			System.out.println();
		}
	}
}
