import java.util.Scanner;
class NearestPrime 
{
	static int num;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		
		nearestPrime();
	}
	
	public static void nearestPrime()
	{
		int temp = num;
		int smallPrime = 0;
		int largePrime = 0;
		
		while(true)
		{
			if(isPrime())
			{
				smallPrime = num;
				break;
			}
			num--;
		}
		
		num = temp;
		
		while(true)
		{
			if(isPrime())
			{
				largePrime = num;
				break;
			}
			num++;
		}
		
		int diff1 = largePrime - temp;
		int diff2 = temp - smallPrime;
		
		int ans = (diff2 < diff1 || diff1 == diff2) ? smallPrime : largePrime;
		System.out.println(ans);
	}
	
	public static boolean isPrime()
	{
		if(num <= 1) return false;
		if(num == 2) return true;
		for(int i = 2; i <= num/2; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
}