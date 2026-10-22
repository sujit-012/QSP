class ProOfEvenEle 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 20, 30, 40, 50};
		System.out.println(proOfEle(a));
	}
	
	public static int proOfEle(int [] num)
	{
		int pro = 1;
		
		for(int a : num)
		{
			if(a % 2 == 0) pro *= a;
		}
		
		return pro;
	}
}
