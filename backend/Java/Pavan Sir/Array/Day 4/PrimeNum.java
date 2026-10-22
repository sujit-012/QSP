class PrimeNum 
{
	public static void main(String[] args) 
	{
		int [] a = {3, 86, 87, 91, 7, 11};
		System.out.println(countOfPrimeNum(a));
	}
	
	public static int countOfPrimeNum(int [] n)
	{
		int count = 0;
		for(int a : n)
		{
			if(isPrime(a))
			{
				System.out.println(a);
				count++;
			}
		}
		return count;
	}
	
	public static boolean isPrime(int num)
	{
		if(num <= 1) return false;
		
		for(int i = 2; i <= num/2; i++)
		{
			if(num % i == 0) return false;
		}
		return true;
	}
}
