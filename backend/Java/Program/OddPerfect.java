class OddPerfect 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 1000; i++)
		{
			if(isPerfect(i))
			{
				if(isOdd(i))
				{
					System.out.println(i);
				}
			}
		}
	}
	
	public static boolean isPerfect(int num)
	{
		int sum = 0;
		
		for(int i = 1; i <= num / 2; i++)
		{
			if(num % i == 0)
			{
				sum = sum + i;
			}
		}
		
		if(sum == num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOdd(int num)
	{
		if(num % 2 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
