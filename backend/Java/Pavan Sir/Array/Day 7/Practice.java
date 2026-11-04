import java.util.Arrays;
class Practice 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 67, 26, 14};
		System.out.println(thirdMax(a));
	}
	
	public static void leftShift(int [] n)
	{
		int temp = n[0];
		
		for(int i = 0; i < n.length - 1; i++)
		{
			n[i] = n[i + 1];
		}
		
		n[n.length - 1] = temp;
	}
	
	public static void rightShift(int [] n)
	{
		int temp = n[n.length - 1];
		
		for(int i = n.length - 1; i > 0; i--)
		{
			n[i] = n[i - 1];
		}
		
		n[0] = temp;
	}
	
	public static void leftShifByKthPosition(int [] n, int k)
	{
		int [] a = new int[n.length];
		
		for(int i = 0; i < n.length; i++)
		{
			a[i] = n[(i + k) % n.length];
		}
		
		for(int i = 0; i < n.length; i++)
		{
			n[i] = a[i];
		}
	}
	
	public static void rightShiftByKthPosition(int [] n, int k)
	{
		int [] a = new int[n.length];
		
		for(int i = 0; i < n.length; i++)
		{
			a[(i+k) % n.length] = n[i];
		}
		
		for(int i = 0; i < n.length; i++)
		{
			n[i] = a[i];
		}
	}
	
	public static int secondMax(int [] n)
	{
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int i = 0; i < n.length; i++)
		{
			if(n[i] > max1)
			{
				max2 = max1;
				max1 = n[i];
			}
			else if (n[i] > max2 && n[i] != max1)
			{
				max2 = n[i];
			}
		}
		
		return max2;
	}
	
	public static int secondMin(int [] n)
	{
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		
		for(int i = 0; i < n.length; i++)
		{
			if(n[i] < min1)
			{
				min2 = min1;
				min1 = n[i];
			}
			else if(n[i] < min2 && n[i] != min1)
			{
				min2 = n[i];
			}
		}
		
		return min2;
	}
	
	public static int thirdMax(int [] n)
	{
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		
		for(int i = 0; i < n.length; i++)
		{
			if(n[i] > max1)
			{
				max3 = max2;
				max2 = max1;
				max1 = n[i];
			}
			else if(n[i] > max2 && n[i] != max1)
			{
				max3 = max2;
				max2 = n[i];
			}
			else if (n[i] > max3 && n[i] != max2 && n[i] != max1)
			{
				max3 = n[i];
			}
		}
		
		return max3;
	}
		
}
