import java.util.Arrays;

class SegPerfectSq 
{
	public static void main(String[] args) 
	{
		int[] a = {16, 7, 25, 13, 49, 18, 36, 22, 81, 30};
		System.out.println(Arrays.toString(a));
		segPerfectSq(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void segPerfectSq(int [] n)
	{
		int i = 0;
		int j = n.length - 1;
		
		while(i < j)
		{
			if(isPerfectSq(n[i]))
			{
				i++;
			}
			else if(!isPerfectSq(n[j]))
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
	
	public static boolean isPerfectSq(int num)
	{
		for(int i = 1; i*i <= num; i++)
		{
			if(i*i == num)
			{
				return true;
			}
		}
		
		return false;
	}
}
