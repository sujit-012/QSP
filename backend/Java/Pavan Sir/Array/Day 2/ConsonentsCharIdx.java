class ConsonentsCharIdx 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		consonentsCharIdx(ch);
	}
	
	public static void consonentsCharIdx(char [] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			if(((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && c[i] <= 'Z')) && 
				!(c[i] == 'A' || c[i] == 'a' || c[i] == 'E' || c[i] == 'e' || c[i] == 'I' || c[i] == 'i' ||
				c[i] == 'O' || c[i] == 'o' || c[i] == 'U' || c[i] == 'u'))
			{
				System.out.println(i);
			}
		}
	}
				
}
