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
		for(int i = 0; i < n.length; i++)
		{
			if(isNeon(n[i] * n[i], n[i]))
			{
				System.out.println(n[i]);
				count++;
			}
		}
		return count;
	}
	
	public static boolean isNeon(int sq, int num)
	{
		int sum = 0;
		while (sq > 0)
		{
			sum += sq%10;
			sq /= 10;
		}
		
	    return sum == num;
	}
}
