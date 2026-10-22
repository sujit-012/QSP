class StoreSunnyNum 
{
	public static void main(String[] args) 
	{
		int [] a = {4, 8, 11, 63, 45, 168};
		int [] n = storeSunnyNum(a);
		
		for(int i = 0; i < n.length; i++)
		{
			System.out.println(n[i]);
		}
	}
	
	public static int[] storeSunnyNum(int [] n)
	{
		int size = countOfSunny(n);
		int [] sunny = new int[size];
		int index = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(isSunny(n[i]))
			{
				sunny[index] = n[i];
				index++;
			}
		}
		
		return sunny;
	}
	
	public static int countOfSunny(int [] n)
	{
		int count = 0;
		for(int i = 0; i < n.length; i++)
		{
			if(isSunny(n[i]))
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean isSunny(int num)
	{
		for(int i = 1; i*i <= num+1; i++)
		{
			if(i*i == num+1)
			{
				return true;
			}
		}
		
		return false;
	}
}
