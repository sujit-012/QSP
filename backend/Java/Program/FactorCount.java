import java.util.Scanner;
class FactorCount 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		
		int count = 1;
		
		for(int den = 1; den <= num / 2; den++)
		{
			if(num % den == 0)
			{
				count++;
			}
			
		}
		
		System.out.println("Factors of given is " + count);
	}
}
