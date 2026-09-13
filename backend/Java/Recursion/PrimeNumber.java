import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		System.out.println(isPrime(num, 2));
	}
	
	
	public static boolean isPrime(int num, int den)
	{
		if(den <= num/2)
		{
			return isPrime(num, den + 1);
		}
		
		return num % den != 0 
	}
}
