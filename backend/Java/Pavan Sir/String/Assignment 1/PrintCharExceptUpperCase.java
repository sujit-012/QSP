class PrintCharExceptUpperCase 
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
			if(!(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
			{
				System.out.println(str.charAt(i));
			}
		}
		
	}
}
