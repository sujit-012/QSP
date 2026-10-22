class SumOfOdd 
{
	public static void main(String[] args) 
	{
		int [] a = {11, 20, 33, 40, 55};
		System.out.println(sumOfOdd(a));
	}
	
	public static int sumOfOdd(int [] num)
	{
		int sum = 0;
		for(int a : num)
		{ 
			if(a % 2 != 0)
			{
				sum += a;
			}
		}
		return sum;
	}
}
