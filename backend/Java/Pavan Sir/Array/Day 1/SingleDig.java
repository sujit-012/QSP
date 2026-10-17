class SingleDig 
{
	public static void main(String[] args) 
	{
		int [] a = {5, 12, 7, 145, 99, 3, 456};
		singDig(a);
	}
	
	public static void singDig(int [] num)
	{
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] <= 9 && num[i] >= -9)
			{
				System.out.println(num[i]);
			}
		}
	}
}
