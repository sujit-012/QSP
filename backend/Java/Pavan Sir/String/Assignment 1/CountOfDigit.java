class CountOfDigit 
{
	public static void main(String[] args) 
	{
		String str = "Hello Java 21 @ Pune# AEIOU xyz 123!";
		System.out.println(countOfLowerCase(str));
	}
	
	public static int countOfLowerCase(String str)
	{
		int count = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				count++;
			}
		}
		
		return count;
	}
}
