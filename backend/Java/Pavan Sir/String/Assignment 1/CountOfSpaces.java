class CountOfSpaces 
{
	public static void main(String[] args) 
	{
		String str = "Hello Java 21 @ Pune# AEIOU xyz 123!";
		System.out.println(countOfSpaces(str));
	}
	
	public static int countOfSpaces(String str)
	{
		int count = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == ' ')
			{
				count++;
			}
		}
		
		return count;
	}
}
