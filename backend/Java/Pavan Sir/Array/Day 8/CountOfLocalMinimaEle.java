class CountOfLocalMinimaEle 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 20, 5, 30, 25, 30, 40};
		System.out.println(ctLocalMinimaEle(a));
	}
	
	public static int ctLocalMinimaEle(int [] n)
	{
		int count = 0;
		
		for(int i = 1; i < n.length - 1; i++)
		{
			if(n[i] < n[i - 1] && n[i] < n[i + 1])
			{
				count++;
			}
		}
		
		return count;
	}
}
