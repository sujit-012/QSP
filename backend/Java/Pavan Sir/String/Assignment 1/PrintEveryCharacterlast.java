class PrintEveryCharacterLast 
{
	public static void main(String[] args) 
	{
		String str = "Sujit";
		print(str);
	}
	
	public static void print(String str)
	{
		for(int i = str.length() - 1; i>= 0; i--)
		{
			System.out.println(str.charAt(i));
		}
	}
}
