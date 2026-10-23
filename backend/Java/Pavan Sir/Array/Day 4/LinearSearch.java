class LinearSearch 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 20, 50, 40, 80};
		System.out.println(linSearch(a, 40));
	}
	
	public static int linSearch(int [] n, int search)
	{
		for(int i = 0; i < n.length; i++)
		{
			if(n[i] == search) return i;
		}
		
		return -1;
	}
}
