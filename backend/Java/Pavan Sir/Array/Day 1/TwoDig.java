class TwoDig 
{
	public static void main(String[] args) 
	{
		int [] a = {5, 12, 7, 145, 99, 3, 456};
		twoDig(a);
	}
	
	public static void twoDig(int [] num)
	{
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] > 9 && num[i] <= 99)
			{
				System.out.println(num[i]);
			}
		}
	}
}
