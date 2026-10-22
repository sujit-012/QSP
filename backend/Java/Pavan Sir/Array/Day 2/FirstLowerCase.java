class FirstLowerCase 
{
	public static void main(String[] args) 
	{
		char[] ch = {'@', 'A', '7', 'n', 'B'};
		firstUpperCase(ch);
	}
	
	public static void firstUpperCase(char [] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] >= 'a' && c[i] <= 'z')
			{
				System.out.println(c[i]);
				break;
			}
		}
	}
}
