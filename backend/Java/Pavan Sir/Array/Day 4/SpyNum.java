class SpyNum 
{
	public static void main(String[] args) 
	{
		int [] a = {16, 123, 300, 1124, 51, 22};
		System.out.println(countOfSpyNum(a));
	}
	
	public static int countOfSpyNum(int [] n)
	{
		int count = 0;
		for(int a : n)
		{
			if(isSpyNum(a))
			{
				System.out.println(a);
				count++;
			}
		}
		return count;
	}
	
	public static boolean isSpyNum(int num)
	{
		int pro = 1;
		int sum = 0;
		
		while(num > 0)
		{
			pro *= num%10;
			sum += num%10;
			num /= 10;
		}
		return sum == pro;
	}
}
