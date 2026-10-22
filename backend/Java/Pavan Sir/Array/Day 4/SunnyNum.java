class SunnyNum 
{
	public static void main(String[] args) 
	{
		int [] a = {4, 8, 11, 63, 45, 168};
		System.out.println(countOfSunnyNum(a));
	}
	
	public static int countOfSunnyNum(int [] n)
	{
		int count = 0;
		
		for(int a : n)
		{
			if(isSunnyNum(a + 1))
			{
				System.out.println(a);
				count++;
			}
		}
		return count;
	}
	
	public static boolean isSunnyNum(int num)
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

