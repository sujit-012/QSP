class ProOfDivBy4 
{
	public static void main(String[] args) 
	{
		int [] a = {5, 12, 7, 145, 99, 3, 456};
		System.out.println(proOfDivBy4(a));
	}
	
	public static int proOfDivBy4(int [] num)
	{
		int pro = 1;
		
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 4 == 0)
			{
				pro *= num[i];
			}
		}
		
		return pro;
	}
}
