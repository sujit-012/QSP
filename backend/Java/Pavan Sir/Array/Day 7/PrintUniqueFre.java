class PrintUniqueFre 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 20, 30, 20, 10, 10};
		printUniqueFre(a);
	}
	
	public static void printUniqueFre(int [] n)
	{
		boolean [] visited = new boolean[n.length];
		
		for(int i = 0; i < n.length; i++)
		{
			int count = 1;
			
			if(visited[i])
			{
				continue;
			}
			
			for(int j = i + 1; j < n.length; j++)
			{
				if(n[i] == n[j])
				{
					count++;
					visited[j] = true;
				}
			}
			
			if(count == 1)
			{
				System.out.println(n[i]);
			}
		}
	}

}
