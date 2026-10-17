class SumOfOddIndex 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 20, 30, 40, 50};
		System.out.println(sumOfOddIndex(a));
	}
	
	public static int sumOfOddIndex(int [] num)
	{
		int sum = 0;
		for(int i = 0; i < num.length; i++)
		{
			if(i % 2 != 0)
			{
				sum = sum + num[i];
			}
		}
		return sum;
	}
}
