class PerfectNum
{
	public static void main(String[] args) 
	{
		int [] a = {12, 6, 17, 28, 11, 496, 1};
		System.out.println(countOfPerfectNum(a));
	}
	
	public static int countOfPerfectNum(int [] n)
	{
		int count = 0;
		for(int a : n)
		{
			if(isPerfect(a))
			{
				System.out.println(a);
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean isPerfect(int num)
	{
		int sum = 0;
		
		for(int i = 1;  i <= num/2; i++)
		{
			if(num % i == 0)
			{ 
				sum += i;
			}
		}
		
		return sum == num;
	}
}
