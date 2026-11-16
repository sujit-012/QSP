class ProOfElePair 
{
	public static void main(String[] args) 
	{
		int [] a = {1, 6, 9, 4, 2, 3};
		int target = 6;
		printProPair(a, target);
	}
	
	public static void printProPair(int [] n, int target)
	{
		for(int i = 0; i < n.length - 1; i++)
		{
			for(int j = i + 1; j < n.length; j++)
			{
				if(n[i] * n[j] == target)
				{
					System.out.println("(" + n[i] + ", " + n[j] + ")");
				}
			}
		}
	}
}
