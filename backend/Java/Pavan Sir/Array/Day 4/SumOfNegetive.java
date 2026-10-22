class SumOfNegetive
{
	public static void main(String[] args) 
	{
		int [] a = {-10, 20, -30, 40, 50};
		System.out.println(sumOfPositive(a));
	}
	
	public static int sumOfPositive(int [] num)
	{
		int sum = 0;
		for(int a : num)
		{
			if(a < 0)
			{
				sum = sum + a;
			}
		}
		return sum;
	}
}
