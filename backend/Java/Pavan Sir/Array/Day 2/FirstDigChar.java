class FirstDigChar 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', '#', 'm', '5', '9'};
		firstDigChar(ch);
	}
	
	public static void firstDigChar(char [] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] >= '0' && c[i] <= '9')
			{
				System.out.println(c[i]);
				break;
			}
		}
	}
}
