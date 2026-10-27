import java.util.Arrays;

class SegMulOf3 
{
	public static void main(String[] args) 
	{
		int[] a = {12, 7, 21, 14, 33, 8, 45, 19, 27, 52};
		System.out.println(Arrays.toString(a));
		segMulOf3(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void segMulOf3(int [] n)
	{
		int i = 0;
		int j = n.length - 1;
		
		while(i < j)
		{
			if(n[i] % 3 == 0)
			{
				i++;
			}
			else if(n[j] % 3 != 0)
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
}
