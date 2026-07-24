class PerfectRange 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 1000; i++)
		{
			if(isPerfect(i))
			{
				System.out.println(i);
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
}
