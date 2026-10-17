class SumOfNegetive 
{
	public static void main(String[] args) 
	{
		int [] a = {-10, 20, -30, 40, -50};
		System.out.println(sumOfNegetive(a));
	}
	
	public static int sumOfNegetive(int [] num)
	{
		int sum = 0;
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] < 0)
			{
				sum = sum + num[i];
			}
		}
		return sum;
	}
}
