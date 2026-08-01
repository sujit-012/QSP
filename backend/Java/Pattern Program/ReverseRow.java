import java.util.Scanner;
class ReverseRow 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of Rows : ");
		int n = sc.nextInt();
		
		int num = n;
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print(num-- +" ");
				if(num < 9) System.out.print(" ");
			}
			
			num += n*2;
			System.out.println();
		}
	}
}
