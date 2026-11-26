class PrintCharExceptSpecial 
{
	public static void main(String[] args) 
	{
		String str = "Hello Java 21 @ Pune# AEIOU xyz 123!";
		printOfChar(str);
	}
	
	public static void printOfChar(String str)
	{
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ||
				(ch >= '0' && ch <= '9'))
			{
				System.out.println(str.charAt(i));
			}
		}
		
	}
}
