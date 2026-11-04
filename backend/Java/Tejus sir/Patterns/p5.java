class p5 
{
	public static void main(String[] args) 
	{
		int n = 4;
		
		for(int i = 0; i < n; i++)
		{
			int no = i + 1;
			
			for(int j = 0; j < n; j++)
			{
				if(no <= 9)
				{
					System.out.print(no + "  ");
				}
				else
				{
					System.out.print(no + " ");
				}
				no += n;
			}
			System.out.println();
		}
	}
}
