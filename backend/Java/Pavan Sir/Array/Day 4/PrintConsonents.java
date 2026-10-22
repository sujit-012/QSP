class PrintConsonents
{
    public static void main(String[] args)
    {
        char[] ch = {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7'};
        printConsonents(ch);
    }

    public static void printConsonents(char[] ch)
    {
        for (char c : ch)
        {
            if ((c >= 'a' && c <= 'z' ||
                 c >= 'A' && c <= 'Z') &&
                !(c == 'A' || c == 'a' ||
                  c == 'E' || c == 'e' ||
                  c == 'I' || c == 'i' ||
                  c == 'O' || c == 'o' ||
                  c == 'U' || c == 'u'))
            {
                System.out.println(c);
            }
        }
    }
}
