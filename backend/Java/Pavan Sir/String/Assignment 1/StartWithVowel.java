class StartWithVowel 
{
	public static void main(String[] args) 
	{
		String str = "ArmStrong";
		System.out.println(isStartWithVowel(str));
	}
	
	public static boolean isStartWithVowel(String str)
	{
		char ch = str.charAt(0);
		
		if(ch == 'A' || ch == 'a' ||
			ch == 'E' || ch == 'e' ||
			ch == 'I' || ch == 'i' ||
		    ch == 'O' || ch == 'o' ||
			ch == 'U' || ch == 'u')
		{
			return true;
		}
		
		return false;
	}
}
