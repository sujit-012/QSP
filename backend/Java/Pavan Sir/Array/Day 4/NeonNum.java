class NeonNum 
{
	public static void main(String[] args) 
	{
		int [] a = {0, 15, 21, 9, 34, 1};
		System.out.println(countOfNeon(a));
	}
	
	public static int countOfNeon(int [] n)
	{
		int count = 0;
		for(int a : n)
		{
			if(a == 9 || a == 0 || a == 1)
			{
				System.out.println(a);
				count++;
			}
		}
		return count;
	}
	
}
