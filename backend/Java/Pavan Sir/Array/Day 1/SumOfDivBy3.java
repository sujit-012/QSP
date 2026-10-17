class SumOfDivBy3 
{
	public static void main(String[] args) 
	{
		int [] a = {5, 12, 7, 145, 99, 3, 456};
		System.out.println(sumOfDivBy3(a));
	}
	
	public static int sumOfDivBy3(int [] num)
	{
		int sum = 0;
		
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 3 == 0)
			{
				sum += num[i];
			}
		}
		
		return sum;
	}
}
