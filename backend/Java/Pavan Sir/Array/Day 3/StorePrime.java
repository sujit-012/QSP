class StorePrime 
{
	public static void main(String[] args) 
	{
		int [] a = {3, 86, 87, 91, 7, 11};
		int [] prime = storePrime(a);
		
		for(int i = 0; i < prime.length; i++)
		{
			System.out.println(prime[i]);
		}
	}
	
	public static int[] storePrime(int [] n)
	{
		int size = countOfPrime(n);
		
		int [] prime = new int[size];
		int index = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(isPrime(n[i]))
			{
				prime[index] = n[i];
				index++;
			}
		}
		
		return prime;
	}
	
	
	public static int countOfPrime(int [] n)
	{
		int count = 0;
		for(int i = 0; i < n.length; i++)
		{
			if(isPrime(n[i]))
			{
				count++;
			}
		}
		return count;
	}
	
	public static boolean isPrime(int num)
	{
		if(num <= 1)
		{
			return false;
		}
		
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
