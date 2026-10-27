import java.util.Arrays;

class SegPalindrome 
{
	public static void main(String[] args) 
	{
		int[] a = {121, 25, 131, 42, 12321, 123, 141, 56, 11, 100};
		System.out.println(Arrays.toString(a));
		segPalindrome(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void segPalindrome(int [] n)
	{
		int i = 0;
		int j = n.length - 1;
		
		while(i < j)
		{
			if(isPalindrome(n[i]))
			{
				i++;
			}
			else if(! isPalindrome(n[j]))
			{
				j--;
			}
			else
			{
				int temp = n[i];
				n[i] = n[j];
				n[j] = temp;
			}
		}
	}
	
	public static boolean isPalindrome(int num)
	{
		int rev = 0;
		for(int i = num; i > 0; i /= 10)
		{
			rev = rev * 10 + i % 10;
		}
		
		return rev == num;
	}
}
