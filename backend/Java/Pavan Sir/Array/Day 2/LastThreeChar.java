class LastThreeChar 
{
	public static void main(String[] args) 
	{
		char[] ch = {'J', 'a', 'v', 'a'};
		lastThreeChar(ch);
	}
	
	public static void lastThreeChar(char [] c)
	{
		for(int i = c.length-3; i < c.length; i++)
		{
			System.out.println(c[i]);
		}
	}
}
