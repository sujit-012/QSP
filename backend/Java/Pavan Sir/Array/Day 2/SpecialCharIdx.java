class SpecialCharIdx 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		specialCharIdx(ch);
	}
	
	public static void specialCharIdx(char [] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			if(!((c[i] >= 'A' && c[i] <= 'Z') || (c[i] >= 'a' && c[i] <= 'z') || (c[i] >= '0' && c[i] <= '9')))
			{
				System.out.println(i);
			}
		}
	}
}
