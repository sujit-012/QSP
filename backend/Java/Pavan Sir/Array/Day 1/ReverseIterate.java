class ReverseIterate 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 20, 30, 40, 50};
		reverseIterate(a);
	}
	
	public static void reverseIterate(int [] num)
	{
		for(int i = num.length - 1; i >= 0; i--)
		{
			System.out.println(num[i]);
		}
	}
}
