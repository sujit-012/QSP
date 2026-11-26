class CountOfAplhabets
{
    public static void main(String[] args)
    {
        String str = "Hello Java 21 @ Pune# AEIOU xyz 123!";
        System.out.println(countOfAplhabets(str));
    }

    public static int countOfAplhabets(String str)
    {
		int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if((ch >= 'a' && ch <= 'z') || (ch >='A' && ch <= 'Z'))
            {
				count++;
            }
        }
		
		return count;
    }
}