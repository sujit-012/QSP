class ProOfOdd 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 3, 5, 20, 11};
		System.out.println(proOfOdd(a));
	}
	
	public static int proOfOdd(int num[])
	{
		int pro = 1;
		
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 2 != 0)
			{
				pro *= num[i];
			}
		}
		
		return pro;
	}
}
