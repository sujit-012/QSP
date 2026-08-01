class FactorialRange 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<= 20; i++)
		{
			long res = fact(i);
			System.out.println(res);
		}
	}
	
	public static long fact(int num)
	{
		long pro = 1;
		
		for(int i = 1; i<= num; i++)
		{
			pro = pro * i;
		}
		
		return pro;
	}
}
