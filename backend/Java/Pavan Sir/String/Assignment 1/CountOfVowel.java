class CountOfVowel 
{
	public static void main(String[] args) 
	{
		String str = "Hello Java 21 @ Pune# AEIOU xyz 123!";
		System.out.println(countOfVowel(str));
	}
	
	public static int countOfVowel(String str)
	{
		int count = 0;
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
				if(ch == 'A' || ch == 'a' ||
				ch == 'E' || ch == 'e' ||
				ch == 'I' || ch == 'i' ||
				ch == 'O' || ch == 'o' ||
				ch == 'U' || ch == 'u')
			{
				count++;
			}
		}
		
		return count;
	}
}
