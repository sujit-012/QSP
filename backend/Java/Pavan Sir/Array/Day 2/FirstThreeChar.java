class FirstThreeChar 
{
	public static void main(String[] args) 
	{
		char[] ch = {'J', 'a', 'v', 'a'};
		firstThreeChar(ch);
	}
	
	public static void firstThreeChar(char [] c)
	{
		for(int i = 0; i < 3; i++)
		{
			System.out.println(c[i]);
		}
	}
}
