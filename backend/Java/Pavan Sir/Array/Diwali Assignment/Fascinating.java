class Fascinating 
{
	public static void main(String[] args) 
	{
		int a = 192;
		int num = (a*1000 +  a*2) *1000 + a*3;
		System.out.println(isFascinating(num, 1));
	}
	
	public static boolean isFascinating(int num, int i)
	{
		if(i > 9)
		{
			return true;
		}
		
		if(checkNum(num, i, 0))
		{
			return isFascinating(num, i+1);
		}
		
		return false;
	}
	
	public static boolean checkNum(int num, int i, int count)
	{
		if(num == 0)
		{
			return count != 0;
		}
		
		if(num % 10 == i)
		{
			count++;
		}
		
		return checkNum(num/10, i + 1; count);
	}
}
		
		
}
