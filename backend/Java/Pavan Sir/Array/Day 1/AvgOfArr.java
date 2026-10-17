class AvgOfArr 
{
	public static void main(String[] args) 
	{
		int a[] = {10, 20, 30, 40, 50};
		System.out.println(avgOfArr(a));
	}
	
	public static double avgOfArr(int num[])
	{
		int sum = 0;
		for(int i = 0; i < num.length; i++)
		{
			sum = sum + num[i];
		}
		
		return sum/num.length;
	}
}
