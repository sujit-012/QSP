class ProDivBy3And4 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 12, 36, 8, 16, 24};
		System.out.println(proDivBy3And4(a));
	}
	
	public static int proDivBy3And4(int [] num)
	{
		int pro = 1;
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 3 == 0 && num[i] % 4 == 0)
			{
				pro *= num[i];
			}
		}
		return pro;
	}
}
