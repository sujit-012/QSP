class StoreSpyNum 
{
	public static void main(String[] args) 
	{
		int [] a = {16, 123, 300, 1124, 51, 22};
		int [] n = storeSpyNum(a);
		
		for(int i = 0; i < n.length; i++)
		{
			System.out.println(n[i]);
		}
	}
	
	public static int[] storeSpyNum(int [] n)
	{
		int size = countOfSpyNum(n);
		int [] spyNum = new int[size];
		int  index = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(isSpyNum(n[i]))
			{
				spyNum[index] = n[i];
				index++;
			}
		}
		
		return spyNum;
	}
	
	public static int countOfSpyNum(int [] n)
	{
		int count = 0;
		for(int i = 0; i < n.length; i++)
		{
			if(isSpyNum(n[i]))
			{
				count++;
			}
		}
		return count;
	}
	
	public static boolean isSpyNum(int num)
	{
		int sum = 0;
		int pro = 1;
		
		while(num > 0)
		{
			sum += num % 10;
			pro *= num % 10;
			num /= 10;
		}
		
		return sum == pro;
	}
}
