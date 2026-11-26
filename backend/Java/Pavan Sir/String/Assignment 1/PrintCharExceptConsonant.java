class PrintCharExceptConsonant
{
    public static void main(String[] args)
    {
        String str = "Hello Java 21 @ Pune# AEIOU xyz 123!";
        printOfChar(str);
    }

    public static void printOfChar(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(!((ch >= 'A' && ch <= 'Z' || 
                  ch >= 'a' && ch <= 'z') &&
                 !(ch == 'A' || ch == 'a' ||
                   ch == 'E' || ch == 'e' ||
                   ch == 'I' || ch == 'i' ||
                   ch == 'O' || ch == 'o' ||
                   ch == 'U' || ch == 'u')))
            {
                System.out.println(ch);
            }
        }
    }
}