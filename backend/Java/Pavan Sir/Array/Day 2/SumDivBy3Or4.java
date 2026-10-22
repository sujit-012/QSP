class SumDivBy3Or4 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 12, 36, 8, 16, 24};
		System.out.println(sumDivBy3Or4(a));
	}
	
	public static int sumDivBy3Or4(int [] num)
	{
		int sum = 0;
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 3 == 0 || num[i] % 4 == 0)
			{
				sum += num[i];
			}
		}
		return sum;
	}
}
