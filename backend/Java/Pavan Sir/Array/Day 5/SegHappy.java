import java.util.Arrays;

class SegHappy 
{
	public static void main(String[] args) 
	{
		int[] a = {19, 25, 7, 42, 23, 12, 28, 56, 31, 100};
		System.out.println(Arrays.toString(a));
		segHappy(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void segHappy(int [] n)
	{
		int i = 0;
		int j = n.length - 1;
		
		while(i < j)
		{
			if(isHappy(n[i]))
			{
				i++;
			}
			else if(!isHappy(n[j]))
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
	
	public static boolean isHappy(int num)
	{
		while(num != 1 && num != 4)
		{
			int sum = 0;
			
			while(num > 0)
			{
				sum += (num % 10) * (num % 10);
				num /= 10;
			}
			
			num = sum;
		}
		
		return num == 1;
	}
}
