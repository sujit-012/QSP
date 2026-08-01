class Pattern11 
{
	public static void main(String[] args) 
	{
		int n = 4;
		int a = 1;
		
		for(int i = 1; i <= n; i++)
		{
			a = i;
			for(int j = 1; j <= n; j++)
			{
				System.out.print(a + " ");
				if(a <= 9) System.out.print(" ");
				a += n;
			}
			System.out.println();
		}
	}
}
