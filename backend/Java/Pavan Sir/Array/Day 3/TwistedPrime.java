class TwistedPrime 
{
	public static void main(String[] args) 
	{
		int [] n = {13, 25, 86, 17, 78, 31};
		System.out.println(countOfTwistedPrime(n));
	}
		
	public static int countOfTwistedPrime(int [] n)
	{
		int count = 0;
		for(int i = 0; i < n.length; i++)
		{
			if(isTwistedPrime(n[i]))
			{
				System.out.println(n[i]);
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean isTwistedPrime(int num)
	{
		if(isPrime(num))
		{
			int rev = 0;
			while(num > 0)
			{
				rev = rev * 10 +  num % 10;
				num /= 10;
			}
			
			if(isPrime(rev))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else 
		{
			return false;
		}
	}
	
	public static boolean isPrime(int num)
	{
		if (num <= 1)
		{
			return false;
		}
		
		for(int i = 2; i <= num/2 ; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
}
