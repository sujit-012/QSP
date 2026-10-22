class StoreHarshad
{
	public static void main(String [] args)
	{
		int [] a = {18, 23, 81, 39};
		int [] n = storeHarshad(a);
		
		for(int i = 0; i < n.length; i++)
		{
			System.out.println(n[i]);
		}
	}
	
	public static int[] storeHarshad(int [] n)
	{
		int size = countOfHarshad(n);
		int [] harshad = new int[size];
		int index = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(isHarshad(n[i]))
			{
				harshad[index] = n[i];
				index++;
			}
		}
		
		return harshad;
	}
	
	public static int countOfHarshad(int [] n)
	{
		int count = 0;
		for(int i = 0; i < n.length; i++)
		{
			if(isHarshad(n[i]))
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean isHarshad(int num)
	{
		int sum = 0;
		int temp = num;
		
		while(num > 0)
		{
			sum += num%10;
			num /= 10;
		}
		
		return temp%sum == 0;
	}
}