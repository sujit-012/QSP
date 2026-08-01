import java.util.Scanner;
class NextPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		for(int i = num + 1; true; i++)
		{
			
			int den = 2;
			
			while(den <= i/2)
			{
				if(i % den == 0)
				{
					break;
				}
				
				den++;
			}
			
			if(den > i / 2)
			{
				System.out.print(i);
				break;
			}
		}
	}
}
