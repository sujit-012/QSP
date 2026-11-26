class PrintDigits 
{
	public static void main(String[] args) 
	{
		String str = "Hello Java 21 @ Pune# AEIOU xyz 123!";
		printDig(str);
	}
	
	public static void printDig(String str)
	{
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				System.out.println(str.charAt(i));
			}
		}
	}
}
