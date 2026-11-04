import java.util.Arrays;

class SegPerfectNum 
{
	public static void main(String[] args) 
	{
		int[] a = {6, 12, 28, 15, 496, 20, 1, 8, 36, 10};
		System.out.println(Arrays.toString(a));
		segPerfect(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void segPerfect(int [] n)
	{
		int i = 0;
		int j = n.length - 1;
		
		while(i < j)
		{
			if(isPerfect(n[i]))
			{
				i++;
			}
			else if(!isPerfect(n[j]))
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
	
	public static boolean isPerfect(int num)
	{
		int sum = 0;
		
		for(int i = 1; i <= num / 2; i++)
		{
			if(num % i == 0)
			{
				sum += i;
			}
		}
		
		return num == sum;
	}
}
