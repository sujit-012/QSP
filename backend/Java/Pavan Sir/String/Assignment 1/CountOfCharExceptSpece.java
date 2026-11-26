class CountOfCharExceptSpece 
{
	public static void main(String[] args) 
	{
		String str = "Hello Java 21 @ Pune# AEIOU xyz 123!";
		System.out.println(countOfChar(str));
	}
	
	public static int countOfChar(String str)
	{
		int count = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) != ' ')
			{
				count++;
			}
		}
		
		return count;
	}
}
