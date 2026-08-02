import java.util.Scanner;
class Pattern6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of rows : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			int num = i;
			for(int j = 1; j <= n; j++)
			{
				System.out.print(num + " ");
				if(num <= 9) System.out.print(" ");
				num += n;
			}
			System.out.println();
		}
	}
}
