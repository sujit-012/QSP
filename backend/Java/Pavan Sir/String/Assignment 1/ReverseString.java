class ReverseString 
{
	public static void main(String[] args) 
	{
		String str = "Hello Java 21 @ Pune# AEIOU xyz 123!";
		System.out.println(reverse(str));
	}
	
	public static String reverse(String str)
	{
		String rev = "";
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		return rev;
	}
}
