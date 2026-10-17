class MiddleElement 
{
	public static void main(String[] args) 
	{
		int a [] = {10, 20, 30, 40};
		if(isMiddle(a))
		{
			System.out.println("Middle ele is available");
		}
		else
		{
			System.out.println("No middle ele");
		}
	}
	
	public static boolean isMiddle(int [] num)
	{
		if(num.length % 2 == 0)
		{ 
			return false;
		}
		
		return true;
	}
}
