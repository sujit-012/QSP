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
		for(int i = 0; i < num.length; i++)
		{ 
			if(num[i] % 2 != 0)
			{
				sum += num[i];
			}
		}
		return sum;
	}
}
