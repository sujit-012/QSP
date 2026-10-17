class ProOfEven 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 20, 30, 40, 50};
		System.out.println(proOfEven(a));
	}
	
	public static int proOfEven(int [] num)
	{
		int pro = 1;
		
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 2 == 0)
			{
				pro *= num[i];
			}
		}
		
		return pro;
	}
}
