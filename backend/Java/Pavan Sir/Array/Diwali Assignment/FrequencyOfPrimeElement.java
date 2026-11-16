class FrequencyOfPrimeElement 
{
	public static void main(String[] args) 
	{
		int[] a = {18, 36, 11, 27, 38, 47, 117, 89867};
		System.out.println(freqOfPrime(a));
	}
	
	public static int freqOfPrime(int [] n)
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
