class ProOfEle 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 20, 30, 40, 50};
		System.out.println(proOfEle(a));
	}
	
	public static int proOfEle(int [] num)
	{
		int pro = 1;
		
		for(int i = 0; i < num.length; i++)
		{
			pro *= num[i];
		}
		
		return pro;
	}
}
