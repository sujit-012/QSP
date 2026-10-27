import java.util.Arrays;

class SegDuck 
{
	public static void main(String[] args) 
	{
		int[] a = {102, 25, 105, 42, 1203, 56, 708, 19, 100, 234};
		System.out.println(Arrays.toString(a));
		segDuck(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void segDuck(int [] n)
	{
		int i = 0;
		int j = n.length - 1;
		
		while(i < j)
		{
			if(isDuck(n[i]))
			{
				i++;
			}
			else if(!isDuck(n[j]))
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
	
	public static boolean isDuck(int num)
	{
		while(num > 0)
		{
			if(num % 10 == 0)
			{
				return true;
			}
			
			num /= 10;
		}
		
		return false;
	}
	
}
