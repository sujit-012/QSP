class FascinatingNum 
{
	public static void main(String[] args) 
	{
		int[] a = {192, 123, 219, 111, 273, 327, 222, 456,  783,  321};
		System.out.println(countOfFascinatingNum(a));
	}
	
	public static int countOfFascinatingNum(int [] n)
	{
		int count = 0;
		for(int i = 0; i < n.length; i++)
		{
			if(isFascinatingNum(n[i]))
			{
				System.out.println(n[i]);
				count++;
			}
		}
		return count;
	}
	
	public static boolean isFascinatingNum(int num)
	{
		if(num < 100 || num > 999)
			return false;

		long nm = ((long) num * 1000 + num * 2) * 1000 + num * 3;

		for(int i = 1; i <= 9; i++)
		{
			long temp = nm;
			int count = 0;

			while(temp > 0)
			{
				if(temp % 10 == i)
					count++;

				temp /= 10;
			}

			if(count != 1)
			return false;
		}

	return true;

	}

}
