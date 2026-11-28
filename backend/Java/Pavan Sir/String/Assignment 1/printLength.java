class printLength 
{
	public static void main(String[] args) 
	{
		String str = "Sujit";
		System.out.println(length(str));
	}
	
	public static int length(String str)
	{
		String str1 = "";
		int count = 0;
		
		for(int i = 0; !str1.equals(str) ; i++)
		{
			str1 = str1 + str.charAt(i);
			count++;
		}
		
		return count;
	}
}
