class PrintFrequencyOfEachElement 
{
	public static void main(String[] args) 
	{
		int[] a = {1, 2, 2, 3, 1, 4};
		printFrequency(a);
	}
	
	public static void printFrequency(int [] n)
	{
		boolean visited[] = new boolean[n.length];
		for(int i = 0; i < n.length; i++)
		{ 
			if(visited[i]) 
			{
				continue;
			}
			
			int count = 1;
			
			for(int j = i + 1; j < n.length; j++)
			{
				if(n[i] == n[j])
				{
					count++;
					visited[j] = true; 
				}
			}
			
			
			System.out.println(n[i] + " ===> " + count);
		}
	}
}
