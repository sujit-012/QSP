class PerfectSq 
{
	public static void main(String[] args) 
	{
		int [] a = {7, 64, 89, 4, 19, 100, 101};
		System.out.println(countOfPerfectSq(a));
	}
	
	public static int countOfPerfectSq(int [] n)
	{
		int count = 0;
		
		for(int a : n)
		{
			if(isPerfectSq(a))
			{
				System.out.println(a);
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean isPerfectSq(int num)
	{
		for(int i = 1; (i*i) <= num; i++)
		{
			if((i*i) == num)
			{
				return true;
			}
		}
		
		return false;
	}
}
