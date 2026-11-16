class FrequencyOfPelindromeElement 
{
	public static void main(String[] args) 
	{
	    int[] a = {18, 36, 111, 272, 38, 47, 11711, 89867};
		System.out.println(freqOfPelindrome(a));
	}
	
	public static int freqOfPelindrome(int [] n)
	{
		int count = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(isPelindrome(n[i]))
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean isPelindrome(int num)
	{
		int rev = 0;
		
		for(int i = num; i > 0; i /= 10)
		{
			rev = rev * 10 + i % 10;
		}
		
		return rev == num;
	}
}
