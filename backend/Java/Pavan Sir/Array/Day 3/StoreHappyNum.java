class StoreHappyNum
{
	public static void main(String[] args) 
	{
		int [] a = {89, 100, 17, 68, 12, 19};
		int [] n = storeHappyNum(a);
		
		for(int i = 0; i < n.length; i++)
		{
			System.out.println(n[i]);
		}
	}
	
	public static int[] storeHappyNum(int [] n)
	{
		int size = countOfHappyNum(n);
		int [] happy = new int[size];
		int index = 0;
		
		for(int i = 0;  i < n.length; i++)
		{
			if(isHappy(n[i]))
			{
				happy[index] = n[i];
				index++;
			}
		}
		
		return happy;
	}
	
	public static int countOfHappyNum(int [] n)
	{
		int count = 0;
		for(int i = 0; i < n.length; i++)
		{
			if(isHappy(n[i]))
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean isHappy(int num)
	{
		while(num != 1 && num != 4)
		{
			int sum = 0;
			while(num > 0)
			{
				sum += (num % 10) * (num % 10);
				num /= 10;
			}
			
			num = sum;
		}
		
		return num == 1;
	}
}
