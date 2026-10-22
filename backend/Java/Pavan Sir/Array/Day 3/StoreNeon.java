class StoreNeon 
{
	public static void main(String[] args) 
	{
		int [] a = {0, 15, 21, 9, 34, 1};
		int [] n = storeNeon(a);
		
		for(int i = 0; i < n.length; i++)
		{
			System.out.println(n[i]);
		}
	}
	
	public static int[] storeNeon(int [] n)
	{
		int size = countOfNeon(n);
		int [] neon = new int[size];
		int index = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(isNeon(n[i]))
			{
				neon[index] = n[i];
				index++;
			}
		}
		
		return neon;
	}
	
	public static int countOfNeon(int [] n)
	{
		int count = 0;
		for(int i = 0; i < n.length; i++)
		{
			if(isNeon(n[i]))
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean isNeon(int num)
	{
		int sq = num*num;
		int sum = 0;
		
		while(sq > 0)
		{
			sum += sq%10;
			sq /= 10;
		}
		
		return sum == num;
	}
}
