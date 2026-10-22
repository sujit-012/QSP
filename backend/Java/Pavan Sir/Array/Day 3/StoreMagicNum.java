class StoreMagicNum
{
	public static void main(String[] args) 
	{
		int [] a = {12, 1234, 87, 1729, 98, 19};
		int [] n = storeMagicNum(a);
		
		for(int i = 0; i < n.length; i++)
		{
			System.out.println(n[i]);
		}
	}
	
	public static int[] storeMagicNum(int [] n)
	{
		int size = countOfMagicNum(n);
		int [] magic = new int[size];
		int index = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(isMagicNum(n[i]))
			{
				magic[index] = n[i];
				index++;
			}
		}
		
		return magic;
	}
	
	public static int countOfMagicNum(int [] n)
	{
		int count = 0;
		for(int i = 0; i < n.length; i++)
		{
			if(isMagicNum(n[i]))
			{
				count++;
			}
		}
		return count;
	}
	
	public static boolean isMagicNum(int num)
	{
		while(num > 9)
		{
			int sum = 0;
			while(num > 0)
			{
				sum += num % 10;
				num /= 10;
			}
			
			num = sum;
		}
		
		return num == 1;
	}
			
}
