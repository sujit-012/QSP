class HappyNum
{
	public static void main(String[] args) 
	{
		int [] a = {89, 100, 17, 68, 12, 19};
		System.out.println(countOfHappyNum(a));
	}
	
	public static int countOfHappyNum(int [] n)
	{
		int count = 0;
		for(int a : n)
		{
			if(isHappy(a))
			{
				System.out.println(a);
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
