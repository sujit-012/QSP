class PrintVowels 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7'};
		printVowels(ch);
	}
	
	public static void printVowels(char [] c)
	{
		for(char a : c)
		{
			if(a == 'A' || a == 'a' || a == 'E' || a == 'e' || a == 'I' || a == 'i' ||
				a == 'O' || a == 'o' || a == 'U' || a == 'u')
			{
					System.out.println(a);
			}
		}
	}
}
