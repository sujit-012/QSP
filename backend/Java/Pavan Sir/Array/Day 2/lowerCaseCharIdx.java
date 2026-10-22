class lowerCaseCharIdx 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		lowerCaseCharIdx(ch);
	}
	
	public static void lowerCaseCharIdx(char [] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] >= 'a' && c[i] <= 'z')
			{
				System.out.println(i);
			}
		}
	}
}
