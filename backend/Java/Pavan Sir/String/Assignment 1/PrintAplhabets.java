class PrintAplhabets
{
    public static void main(String[] args)
    {
        String str = "Hello Java 21 @ Pune# AEIOU xyz 123!";
        PrintAplhabets(str);
    }

    public static void PrintAplhabets(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if((ch >= 'a' && ch <= 'z') || (ch >='A' && ch <= 'Z'))
            {
                System.out.println(ch);
            }
        }
    }
}