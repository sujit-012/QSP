class MagicNum
{
	public static void main(String[] args) 
	{
		int [] a = {12, 1234, 87, 1729, 98, 19};
		System.out.println(countOfMagicNum(a));
	}
	
	public static int countOfMagicNum(int [] n)
	{
		int count = 0;
		for(int a : n)
		{
			if(isMagicNum(a))
			{
				System.out.println(a);
				count++;
			}
		}
		return count;
	}
	
	public static boolean isMagicNum(int num)
	{
		while(num > 9)
		{
			int sum = 0;
			while(num > 0)
			{
				sum += num % 10;
				num /= 10;
			}
			
			num = sum;
		}
		
		return num == 1;
	}
			
}
