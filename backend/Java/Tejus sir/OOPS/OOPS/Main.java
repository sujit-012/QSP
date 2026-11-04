import java.util.Arrays;
class Main
{
	public static void main(String [] args)
	{
		int[] arr = {132, 421, 155349, 1234, 217, 111, 538, 9876, 101, 456};
		
		System.out.println(Arrays.toString(arr));
		segBouncy(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int binSearch(int [] n, int target)
	{
		int i = 0;
		int j = n.length - 1;
		
		while(i <= j)
		{
			int mid = (i + j)/2;
			
			if(n[mid] == target)
			{
				return mid;
			}
			
			if(target > n[mid])
			{
				i = mid + i;
			}
			else
			{
				j = mid - 1;
			}
		}
		return -1;
	}
	
	public static void seg(int [] n)
	{
		int i = 0;
		int j = n.length - 1;
		
		while(i < j)
		{
			if(n[i] % 2 == 0)
			{ 
				i++;
			}
			else if(n[j] % 2 != 0)
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
	
	
	public static void segBouncy(int [] n)
	{
		int i = 0;
		int j = n.length - 1;
		
		while(i < j)
		{
			if(isBouncy(n[i]))
			{
				i++;
			}
			else if(!isBouncy(n[j]))
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
	
	public static boolean isBouncy(int num)
	{
		boolean isInc = false;
		boolean isDec = false;
		int num1 = 0;
		int num2 = 0;
		
		while(num > 9)
		{
			num1 = num % 10;
			num2 = (num/10)%10;
			
			if(num2 > num1)
			{
				isInc = true;
			}
			else if(num2 < num1)
			{
				isDec = true;
			}
			
			if(isInc && isDec)
			{
				return true;
			}
			
			num /= 10;
		}
		
		return false;
	}
}
