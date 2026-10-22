class SumOfEven 
{
	public static void main(String[] args) 
	{
		int a[] = {10, 20, 30, 40, 50};
		System.out.println(sumOfEven(a));
	}
	
	public static int sumOfEven(int num[])
	{
		int sum = 0;
		for(int a : num)
		{
			if(a % 2 == 0)
			{
				sum = sum + a;
			}
		}
		return sum;
	}
}
