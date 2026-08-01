import java.util.Scanner;
class OddPattern 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of row : ");
		int n = sc.nextInt();
		
		int num = 1;
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print(num + " ");
				if(num <= 9) System.out.print(" ");
				num += 2;
			}
			System.out.println();
		}
			
	}
}
