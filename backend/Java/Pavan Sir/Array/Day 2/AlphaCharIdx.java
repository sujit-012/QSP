class AlphaCharIdx 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		alphaCharIdx(ch);
	}
	
	public static void alphaCharIdx(char [] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			if((c[i] >= 'A' && c[i] <= 'Z') || (c[i] >= 'a' && c[i] <= 'z'))
			{
				System.out.println(i);
			}
		}
	}
}
