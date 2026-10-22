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
		for(int i = 0; i < n.length; i++)
		{
			if(isHappy(n[i]))
			{
				System.out.println(n[i]);
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
