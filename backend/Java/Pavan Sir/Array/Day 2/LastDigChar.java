class LastDigChar 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', '#', 'm', '5', '9'};
		lastDigChar(ch);
	}
	
	public static void lastDigChar(char [] c)
	{
		for(int i = c.length - 1; i >= 0; i--)
		{
			if(c[i] >= '0' && c[i] <= '9')
			{
				System.out.println(c[i]);
				break;
			}
		}
	}
}
