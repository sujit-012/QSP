import java.util.Scanner;
class Pattern12 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of rows : ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n-i; j++)
			{
				System.out.print("  ");
			}
			
			int num = 1;
			for(int j = 1; j <= i*2-1;j++)
			{
				System.out.print(num + " ");
				
				if(j < i)
				{
					num++;
				}
				else
				{
					num--;
				}
			}
			
			System.out.println();
		}
	}
}
