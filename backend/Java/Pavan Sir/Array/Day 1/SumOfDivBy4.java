class SumOfDivBy4 
{
	public static void main(String[] args) 
	{
		int [] a = {5, 12, 7, 145, 99, 3, 456};
		System.out.println(sumOfDivBy4(a));
	}
	
	public static int sumOfDivBy4(int [] num)
	{
		int sum = 0;
		
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 4 == 0)
			{
				sum += num[i];
			}
		}
		
		return sum;
	}
}
