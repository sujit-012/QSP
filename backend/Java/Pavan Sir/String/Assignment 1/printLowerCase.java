class PrintLowerCase 
{
	public static void main(String[] args) 
	{
		String str = "ArMstrONg";
		print(str);
	}
	
	public static void print(String str)
	{
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				System.out.println(str.charAt(i));
			}
		}
	}
}
