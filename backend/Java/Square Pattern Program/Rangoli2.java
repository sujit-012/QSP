import java.util.Scanner;
class Rangoli2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(i == n/4 || j == n/4 || i == 3*n/4 || j == 3*n/4 || 
					i == 0 && j < n/4 || i < n/4 && j == 0 || i == 0 && j > 3*n/4 || 
					i < n/4 && j == n-1 || i > 3*n/4 && j == n-1 || i == n-1 && j > 3*n/4 ||
					i > 3*n/4 && j == 0 || i == n-1 && j < n/4 || i==j && i < n/4 || 
					i+j == n - 1 && j > 3*n/4 || i == j && i > 3*n/4 || i+j == n-1 && i > 3*n/4 || 
					i == n/2 && j == n/2)
				{
					System.out.print("*" + " ");
				}
				else
				{
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
	}
}
