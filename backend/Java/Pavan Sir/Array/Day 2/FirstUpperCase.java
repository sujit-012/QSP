class FirstUpperCase 
{
	public static void main(String[] args) 
	{
		char[] ch = {'#', '7', 'm', 'P', 'a'};
		firstUpperCase(ch);
	}
	
	public static void firstUpperCase(char [] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] >= 'A' && c[i] <= 'Z')
			{
				System.out.println(c[i]);
				break;
			}
		}
	}
}
