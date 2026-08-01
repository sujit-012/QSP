class Pattern12 
{
	public static void main(String[] args) 
	{
		int n =4;
		
		int a = (n*2) - 1;
		int b = 1;
		
		for(int i = 1; i <= n; i++)
		{
			int k = i;
			for(int j = 1; j <= n; j++)
			{
				System.out.print(k + " ");
				if(k <= 9) System.out.print(" ");
				
				if(j % 2 != 0)
				{
					k = k + a;
				}
				else
				{
					k = k + b;
				}
			}
			System.out.println();
			a -= 2;
			b += 2;
		}
	}
}
