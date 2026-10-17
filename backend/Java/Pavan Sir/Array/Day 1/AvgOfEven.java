class AvgOfEven 
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
		
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 2 == 0)
			{
				sum += num[i];
				count++;
			}
		}
		
		return sum/count;
	}
}
