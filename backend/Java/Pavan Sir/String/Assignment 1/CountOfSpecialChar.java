class CountOfSpecialChar
{
    public static void main(String[] args)
    {
        String str = "Hello Java 21 @ Pune# AEIOU xyz 123!";
		System.out.println(countOfSpecialChar(str));
    }

    public static int countOfSpecialChar(String str)
    {
		int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >='A' && ch <= 'Z')))
            {
				count++;
            }
        }
		
		return count;
    }
}