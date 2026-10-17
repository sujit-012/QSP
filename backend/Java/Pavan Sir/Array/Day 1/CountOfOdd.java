class CountOfOdd
{
	public static void main(String[] args) 
	{
		int [] a = {5, 12, 7, 145, 99, 3, 456};

		System.out.println(countOdd(a));
	}
	
	public static int countOdd(int num[])
	{
		int count = 0;
		
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 2 != 0)
			{
				count++;
			}
		}
		
		return count;
	}
}
