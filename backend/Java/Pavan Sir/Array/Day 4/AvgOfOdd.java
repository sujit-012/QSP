class AvgOfOdd 
{
	public static void main(String[] args) 
	{
		int [] a = {12, 15, 18, 21, 24, 27};
		System.out.println(avgOfEven(a));
	}
	
	public static double avgOfEven(int [] num)
	{
		int sum = 0;
		int count = 0;
		
		for(int a : num)
		{
			if(a % 2 != 0)
			{
				sum += a;
				count++;
			}
		}
		
		return sum/count;
	}
}
