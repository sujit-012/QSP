class NeonRange 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i <= 1000; i++)
		{
			if(isNeon(i))
			{
				System.out.println(i);
			}
		}
	}
	
	public static boolean isNeon(int num)
	{
		int sq = num * num;
		int sum = 0;
		
		while(sq != 0)
		{
			int dig = sq % 10;
			sum = sum + dig;
			sq = sq / 10;
		}
		
		if(num == sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
