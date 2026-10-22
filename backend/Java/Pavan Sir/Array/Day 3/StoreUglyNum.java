class StoreUglyNum 
{
	public static void main(String[] args) 
	{
		int [] a = {4, 6, 30, 67, 23, 15, 17};
		int [] n = storeUglyNum(a);
		
		for(int i = 0; i < n.length; i++)
		{
			System.out.println(n[i]);
		}
	}
	
	public static int[] storeUglyNum(int [] n)
	{
		int size = countOfUglyNum(n);
		int [] ugly = new int[size];
		int index = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(isUglyNum(n[i]))
			{
				ugly[index] = n[i];
				index++;
			}
		}
		
		return ugly;
	}
	
	public static int countOfUglyNum(int [] n)
	{
		int count = 0;
		for(int i = 0; i < n.length; i++)
		{
			if(isUglyNum(n[i]))
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean isUglyNum(int num)
	{
		while(num % 2 == 0)
		{
			num /= 2;
		}
		
		while(num % 3 == 0)
		{
			num /= 3;
		}
		
		while(num % 5 == 0)
		{
			num /= 5;
		}
		
		return num == 1;
	}
}
