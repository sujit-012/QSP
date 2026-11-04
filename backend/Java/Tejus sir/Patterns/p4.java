class p4 
{
	public static void main(String[] args) 
	{
		int n = 5;
		
		for(int i = 0; i < n; i++)
		{
			int no = i + 1;
			char ch = (char)('a' + i);
			for(int j = 0; j < n; j++)
			{
				if(j % 2 == 0)
				{
					if(no <= 9)
					{
						System.out.print(no + "  ");
					}
					else{
						System.out.print(no + " ");
					}
					no += n;
				}
				else
				{
					System.out.print(ch + " ");
					ch = (char)(ch + n);
				}
			}
			System.out.println();
		}
				
	}
}
