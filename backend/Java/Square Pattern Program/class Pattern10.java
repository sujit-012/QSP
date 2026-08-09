class Pattern10 
{
	public static void main(String[] args) 
	{
		int n = 4;
		
		int a = 1;
		char b = (char) ('a' + (n*n)/2 - 1);
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(j % 2 == 0)
				{
					System.out.print(b-- + " ");
				}
				else
				{
					System.out.print(a++ + " ");
				}
			}
			System.out.println();
		}
	}
}
